package com.ddlab.rnd.doublecolon;

import java.util.function.Function;

class Hey {
  public static double square(double num) {
    return Math.pow(num, 2);
  }

  public static void main(String[] args) {
    Function<Double, Double> square = Hey::square;
    double ans = square.apply(23d);
    System.out.println(ans);
  }
}
