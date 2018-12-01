package com.blockingqueue2;

import java.util.concurrent.BlockingQueue;

public class Producer1 implements Runnable {

    private BlockingQueue<String> bq = null;

    public Producer1(BlockingQueue<String> bq) {
        this.bq = bq;
    }

    @Override
    public void run() {
        try {
            int i = 0;
            while (true) {
                bq.put("A" + i);
                System.out.println("Producer has put: A" + i);
                i++;
                Thread.sleep(1000);

            }
        } catch (final Exception e) {
            e.printStackTrace();
        }

    }
}
