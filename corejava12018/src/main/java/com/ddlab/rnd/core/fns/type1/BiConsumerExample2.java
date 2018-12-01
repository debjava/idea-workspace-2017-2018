package com.ddlab.rnd.core.fns.type1;

import java.util.function.BiConsumer;

public class BiConsumerExample2 {
  public static void main(String[] args) {
    BiConsumer<Integer, Integer> addition =
        (a, b) -> {
          System.out.println(a + b);
        };

    BiConsumer<Integer, Integer> subtraction =
        (a, b) -> {
          System.out.println(a - b);
        };
    // Using andThen()
    addition.andThen(subtraction).accept(10, 6);
  }
}
