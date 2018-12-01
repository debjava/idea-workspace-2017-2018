package com.ddlab.rnd.threads;

import java.util.concurrent.TimeUnit;

public class BackgroundThread {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Value--->" + i);
                    try {
                        TimeUnit.MILLISECONDS.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        new Thread(r).start();
        //this line will execute immediately, not waiting for your task to complete
        System.out.println("Exiting main thread ...");

    }
}
