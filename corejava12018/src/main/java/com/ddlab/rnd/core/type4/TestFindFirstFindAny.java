package com.ddlab.rnd.core.type4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TestFindFirstFindAny {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
    Optional<Integer> result = list.stream().parallel().filter(num -> num < 4).findAny();
    System.out.println("result.isPresent()--->" + result.isPresent()); // true
    System.out.println("result.get()--->" + result.get()); // 3
  }
}
