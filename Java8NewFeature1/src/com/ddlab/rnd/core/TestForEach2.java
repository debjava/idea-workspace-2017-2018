package com.ddlab.rnd.core;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class MyConsumer implements Consumer<Integer> {
  public void accept(Integer t) {
    System.out.println("Consumer impl Value::" + t);
  }
}

public class TestForEach2 {
  public static void main(String[] args) {
    List<Integer> myList = new ArrayList<Integer>();
    for (int i = 0; i < 10; i++) myList.add(i);

    myList.forEach(
        new Consumer<Integer>() {
          public void accept(Integer t) {
            System.out.println("forEach anonymous class Value::" + t);
          }
        });

    myList.forEach(new MyConsumer());
  }
}
