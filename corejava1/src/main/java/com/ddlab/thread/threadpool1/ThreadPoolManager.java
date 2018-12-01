package com.ddlab.thread.threadpool1;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ThreadPoolManager {
 
    private final int THREADPOOL_CAPACITY;
//    private MyQueue<Runnable> myQueue = new MyQueue<Runnable>();
private BlockingQueue<Runnable> myQueue = new LinkedBlockingQueue<Runnable>();
     
    public ThreadPoolManager(int capacity){
        this.THREADPOOL_CAPACITY = capacity;
        initAllConsumers();
    }
     
    private void initAllConsumers(){
        for(Integer i = 0; i < THREADPOOL_CAPACITY; i++){
            Thread thread = new Thread(new Worker(myQueue, i.toString()));
            thread.start();
        }
    }
     
     
    public void submitTask(Runnable r){
//        myQueue.enqueue(r);
        myQueue.offer(r);
    }
     
}