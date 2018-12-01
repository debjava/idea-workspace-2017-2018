package com.ddlab.rnd.thread.cb2;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

public class Task2 implements Runnable {

    private CyclicBarrier barrier;

    public Task2(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    @Override
    public void run() {
        System.out.printf("\nStarting task2 ...");
        try {
            TimeUnit.SECONDS.sleep(3);
            System.out.printf("\n"+Thread.currentThread().getName()+" working on task2");
            barrier.await();
            System.out.printf("\n"+Thread.currentThread().getName()+" waiting for others to complete ... ");
        }
        catch (InterruptedException ie) {
            ie.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
        System.out.printf("\n"+Thread.currentThread().getName()+" completed task2");
    }
}
