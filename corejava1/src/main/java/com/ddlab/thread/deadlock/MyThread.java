package com.ddlab.thread.deadlock;

/**
 * Created by PIKU on 5/23/2017.
 */
public class MyThread extends Thread {
    private String name;
    private MyObject obj;

    public MyThread(String name , MyObject obj ) {
        setName(name);
        this.obj = obj;
    }

    @Override
    public void run() {
        obj.doNonStatic();
    }
}
