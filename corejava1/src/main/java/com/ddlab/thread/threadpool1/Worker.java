package com.ddlab.thread.threadpool1;

import java.util.concurrent.BlockingQueue;

public class Worker implements Runnable{
 
//    private MyQueue<Runnable> myQueue;
    private BlockingQueue<Runnable> myQueue;
    private String name;
     
    public Worker(BlockingQueue<Runnable> myQueue, String name){
        this.myQueue = myQueue;
        this.name = name;
    }
     
     
    @Override
    public void run() {
        while(true){
//            Runnable r = myQueue.dequeue();
            Runnable r = myQueue.poll();
            // print the dequeued item
            System.out.println(" Taken Item by thread name:" + this.name );
            // run it
//            r.run();
//            if( r != null )
            try {
                r.run();
            }
            catch (RuntimeException re) {

            }

            System.out.println(" Task completed of thread:" + this.name);
        }
    }
}