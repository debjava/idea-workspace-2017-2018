package com.ddlab.thread.semaphore1;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable {

    Semaphore semaphoreProducer;
    Semaphore semaphoreConsumer;

    public Producer(Semaphore semaphoreProducer, Semaphore semaphoreConsumer) {
        this.semaphoreProducer = semaphoreProducer;
        this.semaphoreConsumer = semaphoreConsumer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                semaphoreProducer.acquire();
                System.out.println("Produced : " + i);
                Thread.sleep(1000);
                semaphoreConsumer.release();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}