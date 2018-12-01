package com.ddlab.thread.join;

public class TestThreadJoin {
    public static void main(String[] args) throws InterruptedException {

        Thread th1 = new Thread(new Task());
        th1.start();
        th1.join();//here the main thread will wait until thread1 fishes.
        System.out.println("after join");
        Thread th2 = new Thread(new Task());
        th2.start();
        th2.join();//here the main thread will wait until thread1 fishes.
    }
}
