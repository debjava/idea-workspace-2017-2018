package com.ddlab.thread.deadlock;

/**
 * Created by PIKU on 5/23/2017.
 */
public class MyThread2 extends Thread {
    private String name;

    public MyThread2(String name) {
        setName(name);

    }

    @Override
    public void run() {
        MyObject.doStatic();
    }
}
