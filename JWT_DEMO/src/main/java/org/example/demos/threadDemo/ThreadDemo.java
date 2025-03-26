package org.example.demos.threadDemo;

import java.util.concurrent.FutureTask;

public class ThreadDemo {
    //main也是线程
    public static void main(String[] args) {

        ThreadWay1 thread1 = new ThreadWay1();
        ThreadWay1 thread2 = new ThreadWay1();
        thread1.start();
        thread2.start();

//        static void sleep(long time);//单位为ms
//        set/getPriority();//设置或获取优先级，1-10，默认为5
//        final void setDaemon(boolean on)//设置为守护线程，在被守护线程执行完后，守护进程会渐渐死亡
//        Thread.yield() //礼让进程执行到该方法后让出处理器使用权
//        xxx.join() //xxx属于Thread类，即在执行该进程之前先执行xxx进程
//        void wait //当前线程等待，知道被其他线程唤醒
//        void notify/notifyAll() //唤醒该锁的随机单个或该锁所有线程

//        Way1
//        ThreadWay1 threadWay1 = new ThreadWay1();
//        threadWay1.setName("xxx");//给线程命名
//        threadWay1.start();//父类方法
//
//        Way2
//        ThreadWay2 threadWay2 = new ThreadWay2();
//        Thread thread = new Thread(threadWay2);
//        thread.start()

//        Way3
//        ThreadWay3 threadWay3= new ThreadWay3();
//        FutureTask<Integer> futureTask = new FutureTask<>(threadWay3);//用于管理多线程运行的结果
//        Thread thread = new Thread(futureTask);
//        thread.start();
    }
}
