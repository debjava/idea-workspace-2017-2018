package com.ddlab.rnd.lambdaex;

interface Addable {
  int add(int a, int b);
}

public class Test2 {
  public static void main(String[] args) {
    Addable adder =
        (a, b) -> {
          return a + b;
        };
    int val = adder.add(10, 20);
    System.out.println(val);

    // Another way of writing
    Addable adder1 = (a, b) -> (a + b);
    int val1 = adder1.add(30, 40);
    System.out.println(val1);
  }
}
