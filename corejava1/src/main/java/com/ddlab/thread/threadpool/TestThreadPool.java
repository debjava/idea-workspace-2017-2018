package com.ddlab.thread.threadpool;

public class TestThreadPool {
    public static void main(String[] args) throws InterruptedException {
        //create queue size - 3
    	//Number of threads - 4
        ThreadPool threadPool = new ThreadPool(4,4);
        //Created 15 Tasks and submit to pool
        for(int taskNumber = 1 ; taskNumber <= 7; taskNumber++) {
            MyThread task = new MyThread(taskNumber);
            threadPool.submitTask(task);
        }
    }
}