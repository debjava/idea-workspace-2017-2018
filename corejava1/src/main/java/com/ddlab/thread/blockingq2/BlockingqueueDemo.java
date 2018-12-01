package com.ddlab.thread.blockingq2;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingqueueDemo {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>();
        Producer produce = new Producer(queue);
        Consumer consume = new Consumer(queue);
        produce.start();
        consume.start();
    }

}