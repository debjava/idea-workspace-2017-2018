package com.blockingqueue2;

import java.util.concurrent.BlockingQueue;

/**
 * Created by PIKU on 9/10/2015.
 */
public class Consumer1 implements Runnable {

    private BlockingQueue<String> bq = null;

    public Consumer1(BlockingQueue<String> bq) {
        this.bq = bq;
    }

    @Override
    public void run() {
        try {
            while (true) {
                final String data = bq.take();
                System.out.println("Consumer has consumed.." + data);
            }
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }
}
