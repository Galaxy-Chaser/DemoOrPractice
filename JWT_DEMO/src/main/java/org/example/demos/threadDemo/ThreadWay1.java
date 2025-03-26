package org.example.demos.threadDemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadWay1 extends Thread {

    static int cnt = 1;

    static Object lock = new Object();//设置静态让其他该类线程共享这个锁

    static Lock lock1 = new ReentrantLock();

    @Override
    public void run() {
        while(true) {
            lock1.lock();
            try{
                if(cnt > 100)
                    break;
                if(cnt % 2 == 1)
                    System.out.println(cnt);
                ++cnt;
            }finally {
                lock1.unlock();
            }
        }
//        上锁 （）内一定是唯一的，可以填当前类.class,字节码唯一
//        synchronized (lock) {
//            //执行方法
//        }
//        getName() 获取线程名称

//        也可以通过Lock类的方法来上锁解锁
//        lock1.lock();
//        lock1.unlock();//一般将解锁代码放在try，catch，final中，在final中即使出现异常也能解锁
    }
}
