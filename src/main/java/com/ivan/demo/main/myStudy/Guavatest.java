package com.ivan.demo.main.myStudy;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@Service
public class Guavatest {

    private static Logger logger = LoggerFactory.getLogger(Guavatest.class);

    private final ExecutorService executor = Executors.newFixedThreadPool(1);

    private LoadingCache<String, List<String>> testCache = CacheBuilder.newBuilder().
            refreshAfterWrite(1, TimeUnit.SECONDS).build(
            new CacheLoader<String, List<String>>() {
                @Override
                public List<String> load(String s) {
                    logger.info("load--------------key:" + s);
                    List<String> list = new ArrayList<>();
                    list.add("1");
                    list.add("2");
                    list.add("3");
                    return list;
                }

                @Override
                public ListenableFuture<List<String>> reload(String key, List<String> oldValue) {
                    logger.info("reload--------------key:" + key);
                    ListenableFutureTask<List<String>> task = ListenableFutureTask.create(() -> {
                                for (int i = 0; i < 10000; i++) {
                                    logger.info("start");
                                    logger.info(String.valueOf(i));
                                    logger.info("end");
                                }
                                List<String> list = new ArrayList<>();
                                list.add("4");
                                list.add("5");
                                list.add("6");
                                return list;
                            }
                    );
                    executor.execute(task);
                    return task;
                }
            }
    );

    public List<String> get(String key) {
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
