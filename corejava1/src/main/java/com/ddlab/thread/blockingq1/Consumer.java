package com.ddlab.thread.blockingq1;

import java.util.concurrent.BlockingQueue;

class Consumer extends Thread {
    private BlockingQueue<Integer> sharedQueue;

    public Consumer(BlockingQueue<Integer> aQueue) {
        super("CONSUMER");
        this.sharedQueue = aQueue;
    }

    public void run() {
        try {
            while (true) {
                Integer item = sharedQueue.take();
                if (item == null || item == -1) {
                    break;
                }
                System.out.println(getName() + " consumed " + item);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

