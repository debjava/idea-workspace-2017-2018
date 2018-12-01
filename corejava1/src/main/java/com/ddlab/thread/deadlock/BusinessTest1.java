package com.ddlab.thread.deadlock;

public class BusinessTest1 {
    public static void main(String[] args) {
        final Business business = new Business();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                business.foo();
            }
        });
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                business.bar();
            }
        });
        t2.start();
    }
}