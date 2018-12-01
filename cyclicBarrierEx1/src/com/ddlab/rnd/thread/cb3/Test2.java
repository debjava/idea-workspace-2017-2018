package com.ddlab.rnd.thread.cb3;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

public class Test2 {

    public static void executeParallel() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Set<Callable<String>> callables = new HashSet<Callable<String>>();

        callables.add(new MyCallableTask("Task 1", 3));
        callables.add(new MyCallableTask("Task 2", 5));
        callables.add(new MyCallableTask("Task 3", 7));

        List<Future<String>> futures = null;
        try {
            futures = executorService.invokeAll(callables);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (Future<String> future : futures) {
            try {
                System.out.println("\nfuture.get = " + future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        executorService.shutdown();
        System.out.printf("All task completed ...");
    }

    public static void main(String[] args) {
        executeParallel();
    }
}
