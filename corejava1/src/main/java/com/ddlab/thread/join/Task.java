package com.ddlab.thread.join;

import java.util.concurrent.TimeUnit;

public class Task implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started.");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " completed.");
    }
}
