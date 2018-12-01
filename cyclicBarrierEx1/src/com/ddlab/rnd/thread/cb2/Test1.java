package com.ddlab.rnd.thread.cb2;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

public class Test1 {

    private static void performFinal() {
        try {
            TimeUnit.SECONDS.sleep(2);
            System.out.printf("\nPerformed the final one ... ");
        }
        catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    public static void executeParallely() {
        CyclicBarrier barrier = new CyclicBarrier(3);

        Thread thread1 = new Thread(new Task1(barrier));
        thread1.setName("Task1");

        Thread thread2 = new Thread(new Task2(barrier));
        thread2.setName("Task2");
        System.out.printf("\nStarting both threads ...");
        thread1.start();
        thread2.start();

        try {
            barrier.await();
            System.out.printf("\nAll tasks completed successfully ...");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        executeParallely();
        //Perform the final task
        performFinal();
    }
}
