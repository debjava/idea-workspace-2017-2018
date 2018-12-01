package com.ddlab.thread.blockingq2;

import java.util.concurrent.BlockingQueue;

public class Producer extends Thread {

    BlockingQueue queue;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;

    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("produce" + i);
            try {
                queue.put(i);
                Thread.sleep(1000);

            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

}