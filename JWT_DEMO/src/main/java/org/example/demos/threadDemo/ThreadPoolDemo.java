package org.example.demos.threadDemo;

import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        //自定义线程池
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                3,//核心线程池个数
                6,//线程池最大线程个数，除核心外其他为临时线程
                60,//时间,超过该时间临时线程自动销毁
                TimeUnit.SECONDS,//时间单位
                new LinkedBlockingQueue<Runnable>(),//任务队列
                Executors.defaultThreadFactory(),//创建线程工厂
                new ThreadPoolExecutor.AbortPolicy()//任务的拒绝策略
        );

        //获取线程池对象(大小为Integer.MAX_VALUE)
        ExecutorService pool1 = Executors.newCachedThreadPool();
        //获取线程池对象(大小为n)
//        ExecutorService pool2 = Executors.newFixedThreadPool(n);
        //提交任务
        pool1.submit(new ThreadWay2());
        //销毁
        pool1.shutdown();
    }
}
