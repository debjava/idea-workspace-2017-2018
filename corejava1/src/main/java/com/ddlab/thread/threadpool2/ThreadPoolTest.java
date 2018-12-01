package com.ddlab.thread.threadpool2;

public class ThreadPoolTest{
    public static void main(String[] args) throws Exception {

//           ThreadPool threadPool=new ThreadPool(2); //create 2 threads in ThreadPool
//           Runnable task=new MyThread();
//           threadPool.execute(task);
//           threadPool.execute(task);
//
//           threadPool.shutdown();

        ThreadPool threadPool=new ThreadPool(3);
        for (int i = 0; i < 5; i++) {
            Runnable task=new MyThread();
            threadPool.execute(task);
        }
        threadPool.shutdown();
    }
    
}