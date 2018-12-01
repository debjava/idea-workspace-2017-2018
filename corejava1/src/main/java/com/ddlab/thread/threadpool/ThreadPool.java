package com.ddlab.thread.threadpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class ThreadPool {

    private BlockingQueue<Runnable> queue;

    public ThreadPool(int queueSize, int nThread) {
        queue = new LinkedBlockingDeque<>(queueSize);
        String threadName = null;
        TaskExecutor task = null;
        for (int count = 0; count < nThread; count++) {
        	threadName = "Thread-"+count;
        	task = new TaskExecutor(queue);
            Thread thread = new Thread(task, threadName);
            thread.start();
        }
    }

    public void submitTask(Runnable task) throws InterruptedException {
        queue.offer(task);
    }
}