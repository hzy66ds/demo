package com.ivan.demo.main.myStudy;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@Service
public class Guavatest {

    private static Logger logger = LoggerFactory.getLogger(Guavatest.class);

    private LoadingCache<String, Integer> testCache = CacheBuilder.newBuilder().
            refreshAfterWrite(10, TimeUnit.SECONDS).build(
            new CacheLoader<String, Integer>() {
                @Override
                public Integer load(String s) {
                    logger.info("load--------------key:" + s);
                    return Integer.valueOf(s);
                }

                @Override
                public ListenableFuture<Integer> reload(String key, Integer oldValue) {
                    logger.info("reload--------------key:" + key);
                    ListenableFutureTask<Integer> task = ListenableFutureTask.create(() -> {
                                for (int i = 0; i < 200000; i++) {
                                    logger.info("start");
                                    logger.info(String.valueOf(i));
                                    logger.info("end");
                                }
                                return 666;
                            }
                    );
                    ExecutorService executor = Executors.newFixedThreadPool(1);
                    executor.execute(task);
                    return task;
                }
            }
    );

    public Integer get(String key) {
        return testCache.getUnchecked(key);
    }
}


//
//    ListenableFutureTask<Integer> task2 = ListenableFutureTask.create(new Callable<Integer>() {
//        public Integer call() {
//            System.out.println("reload--------------key:" + key + "new Value" + "666");
////                                    return getGraphFromDatabase(key);
//            return 666 + oldValue;
//        }
//    });
