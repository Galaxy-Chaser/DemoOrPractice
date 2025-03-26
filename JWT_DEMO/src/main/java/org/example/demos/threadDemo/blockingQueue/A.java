package org.example.demos.threadDemo.blockingQueue;

import java.util.concurrent.BlockingQueue;

public class A extends Thread{

    BlockingQueue<String> queue;

    public A(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        //
    }

}
