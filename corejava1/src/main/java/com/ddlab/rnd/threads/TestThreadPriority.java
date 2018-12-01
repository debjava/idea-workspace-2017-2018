package com.ddlab.rnd.threads;

class MyThread extends Thread {
    public MyThread(String name) {
        setName(name);
    }
    public void run() {
        System.out.println("-->"+Thread.currentThread().getName());
    }
}
public class TestThreadPriority {
    public static void main(String[] args) {
        Thread t1 = new MyThread("Foo");
        Thread t2 = new MyThread("Bar");
//        t2.setPriority(Thread.NORM_PRIORITY+1);

        t1.start();
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();
    }
}
