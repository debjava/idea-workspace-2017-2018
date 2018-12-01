package com.ddlab.thread.blockingq1;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerSolution {
    public static void main(String[] args) {
        BlockingQueue<Integer> sharedQ = new LinkedBlockingQueue<Integer>(10);
        Producer p = new Producer(sharedQ);
        Consumer c = new Consumer(sharedQ);
        p.start();
        c.start();
    }
}

