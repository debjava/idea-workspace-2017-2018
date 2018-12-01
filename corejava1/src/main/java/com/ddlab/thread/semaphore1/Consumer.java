package com.ddlab.thread.semaphore1;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {

    Semaphore semaphoreConsumer;
    Semaphore semaphoreProducer;

    public Consumer(Semaphore semaphoreConsumer, Semaphore semaphoreProducer) {
        this.semaphoreConsumer = semaphoreConsumer;
        this.semaphoreProducer = semaphoreProducer;
    }

    public void run() {

        for (int i = 1; i <= 5; i++) {
            try {
                semaphoreConsumer.acquire();
                System.out.println("Consumed : " + i);
                Thread.sleep(1000);
                semaphoreProducer.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}