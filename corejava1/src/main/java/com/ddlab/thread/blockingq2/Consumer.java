package com.ddlab.thread.blockingq2;

import java.util.concurrent.BlockingQueue;

public class Consumer extends Thread {
    BlockingQueue queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;

    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("consume" + queue.take());
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}