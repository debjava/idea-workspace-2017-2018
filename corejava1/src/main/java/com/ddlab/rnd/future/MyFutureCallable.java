package com.ddlab.rnd.future;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class MyFutureCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        String retString = "got";
        try {
            TimeUnit.SECONDS.sleep(20);
            System.out.println("Execution completed ... ");
        }
        catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        return retString;
    }
}
