package com.ddlab.thread.threadpool2;

class MyThread implements Runnable{
    @Override
    public void run() {
           try {
                  Thread.sleep(2000);
                  System.out.println(Thread.currentThread().getName()
                               +" is executing task.");
           } catch (InterruptedException e) {
                  e.printStackTrace();
           }
    }
}