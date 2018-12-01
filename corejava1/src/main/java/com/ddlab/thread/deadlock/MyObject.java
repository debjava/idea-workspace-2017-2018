package com.ddlab.thread.deadlock;

import java.util.concurrent.TimeUnit;

public class MyObject {

    public synchronized static void doStatic() {
        System.out.println("Inside doStatic Thread->"+Thread.currentThread().getName());
        for (int i = 0; i < 20; i++) {
            System.out.println("Static---->"+i);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void doNonStatic() {
        System.out.println("Inside doNonStatic Thread->"+Thread.currentThread().getName());
        for (int i = 0; i < 20; i++) {
            System.out.println("Non-Static---->"+i);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
