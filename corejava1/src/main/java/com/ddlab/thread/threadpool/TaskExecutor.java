package com.ddlab.thread.threadpool;

import java.util.concurrent.BlockingQueue;

public class TaskExecutor implements Runnable {
    private BlockingQueue<Runnable> queue;
    
    public TaskExecutor(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String name = Thread.currentThread().getName();
                Runnable task = queue.poll();
                if( task != null ) {
                    System.out.println("Task Started by Thread :" + name);
                    System.out.println(task);
                    task.run();
                    System.out.println("Task Finished by Thread :" + name);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}