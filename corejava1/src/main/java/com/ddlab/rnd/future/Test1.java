package com.ddlab.rnd.future;

import java.util.concurrent.*;

public class Test1 {

    public static void main(String[] args) {

        Callable th1 = new MyFutureCallable();
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> future = executorService.submit(th1);
        try {
            while (!future.isDone()) {
                //wait here
                System.out.println("I am doing something in the mean time ...");
            }
            String s = future.get();
            System.out.println("Final Value --->"+s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("Complted ...");

        executorService.shutdown();
    }
}
