package org.example.demos.threadDemo.blockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDemo {
    public static void main(String[] args) {
        //需要在main中创建阻塞队列供双方使用
        BlockingQueue<String> queue = new ArrayBlockingQueue<String>(10);
        A a = new A(queue);
        B b = new B(queue);
        a.start();
        b.start();
    }
}
