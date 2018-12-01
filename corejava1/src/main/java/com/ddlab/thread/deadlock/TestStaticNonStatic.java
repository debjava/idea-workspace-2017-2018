package com.ddlab.thread.deadlock;

public class TestStaticNonStatic {

    public static void main(String[] args) {
        Thread th1 = new MyThread("T1", new MyObject());
        Thread th2 = new MyThread2("T1");
        th1.start();
        th2.start();
    }
}
