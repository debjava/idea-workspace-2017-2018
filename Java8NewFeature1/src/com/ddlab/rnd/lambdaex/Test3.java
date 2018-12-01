package com.ddlab.rnd.lambdaex;

@FunctionalInterface
interface Calculator {
  int multiplication(int a, int b);
}

@FunctionalInterface
interface Printable {
  void print();
}

public class Test3 {

  public static int multiply(int x, int y, Calculator calc) {
    return calc.multiplication(x, y);
  }

  public static void printInPrinter(Printable printable) {
    printable.print();
  }

  public static void main(String[] args) {
    // Lambda expression is only applicable to Functional Interface
    int mulValue = multiply(10, 20, (x, y) -> (x * y));
    System.out.println(mulValue);

    printInPrinter(() -> System.out.println("Printing in printer ..."));
  }
}
