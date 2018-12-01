package com.ddlab.rnd.core.fns.type1;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class Main {
  public static void main(String[] args) {
    BinaryOperator<Integer> minBO = BinaryOperator.minBy(Comparator.naturalOrder());
    System.out.println(minBO.apply(2, 3)); // Prints 2

    BinaryOperator<Integer> minReverse = BinaryOperator.minBy(Comparator.reverseOrder());
    System.out.println(minReverse.apply(2, 3)); // Prints 3
  }
}
