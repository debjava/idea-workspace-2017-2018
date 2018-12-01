package com.ddlab.rnd.thread.cb3;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class MyCallableTask implements Callable<String> {

  private String name;
  private int waitTimeIn;

  public MyCallableTask(String name, int waitTimeIn) {
    this.name = name;
    this.waitTimeIn = waitTimeIn;
    Thread.currentThread().setName(name);
  }

  @Override
  public String call() throws Exception {
    TimeUnit.SECONDS.sleep(waitTimeIn);
    String returnMsg = name + " done .";
    System.out.printf("\n " + name + " completed ...");
    return returnMsg;
  }
}
