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
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class Guavatest {

    private static Logger logger = LoggerFactory.getLogger(Guavatest.class);

//    private final ExecutorService executor = Executors.newFixedThreadPool(1,new NamedThreadFactory("jjjjjjjj"));

    final long awaitTime = 5 * 1000;

    private LoadingCache<String, List<String>> testCache = CacheBuilder.newBuilder().
            refreshAfterWrite(5, TimeUnit.SECONDS).build(
            new CacheLoader<String, List<String>>() {
                @Override
                public List<String> load(String s) {
                    logger.info("load--------------key:" + s);
                    for (int i = 0; i < 10000; i++) {
                        logger.info("start");
                        logger.info(String.valueOf(i));
                        logger.info("end");
                    }
                    List<String> list = new ArrayList<>();
                    list.add("1"+Math.random());
                    list.add("2"+Math.random());
                    list.add("3"+Math.random());
                    return list;
                }

//                @Override
//                public ListenableFuture<List<String>> reload(String key, List<String> oldValue) {
//                    logger.info("reload--------------key:" + key);
//                    ListenableFutureTask<List<String>> task = ListenableFutureTask.create(() -> {
////                                for (int i = 0; i < 10000; i++) {
////                                    logger.info("start");
////                                    logger.info(String.valueOf(i));
////                                    logger.info("end");
////                                }
//                                List<String> list = new ArrayList<>();
//                                list.add("4");
//                                list.add("5");
//                                list.add("6");
//                                return list;
//                            }
//                    );
//                    ExecutorService executor = Executors.newFixedThreadPool(1);
//                    executor.execute(task);
//                    try {
//                        // 向学生传达“问题解答完毕后请举手示意！”
//                        executor.shutdown();
//
//                        // 向学生传达“XX分之内解答不完的问题全部带回去作为课后作业！”后老师等待学生答题
//                        // (所有的任务都结束的时候，返回TRUE)
//                        if(!executor.awaitTermination(awaitTime, TimeUnit.MILLISECONDS)){
//                            // 超时的时候向线程池中所有的线程发出中断(interrupted)。
//                            executor.shutdownNow();
//                        }
//                    } catch (InterruptedException e) {
//                        // awaitTermination方法被中断的时候也中止线程池中全部的线程的执行。
//                        System.out.println("awaitTermination interrupted: " + e);
//                        executor.shutdownNow();
//                    }
//                    return task;
//                }
            }
    );

    public List<String> get(String key) {
        return testCache.getUnchecked(key);
    }

    // 命名线程工厂
//    static class NamedThreadFactory implements ThreadFactory {
//        private static final AtomicInteger poolNumber = new AtomicInteger(1);
//        private final ThreadGroup group;
//        private final AtomicInteger threadNumber = new AtomicInteger(1);
//        private final String namePrefix;
//
//        NamedThreadFactory(String name) {
//
//            SecurityManager s = System.getSecurityManager();
//            group = (s != null) ? s.getThreadGroup() : Thread.currentThread().getThreadGroup();
//            if (null == name || name.isEmpty()) {
//                name = "pool";
//            }
//
//            namePrefix = name + "-" + poolNumber.getAndIncrement() + "-thread-";
//        }
//
//        public Thread newThread(Runnable r) {
//            Thread t = new Thread(group, r, namePrefix + threadNumber.getAndIncrement(), 0);
//            if (t.isDaemon())
//                t.setDaemon(false);
//            if (t.getPriority() != Thread.NORM_PRIORITY)
//                t.setPriority(Thread.NORM_PRIORITY);
//            return t;
//        }
//    }
}


