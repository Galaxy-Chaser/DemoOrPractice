package org.example.demos.threadDemo.blockingQueue;

import java.util.concurrent.BlockingQueue;

public class B extends Thread {

    BlockingQueue<String> queue;

    public B(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

    }
}
