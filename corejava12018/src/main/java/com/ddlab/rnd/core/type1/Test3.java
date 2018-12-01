package com.ddlab.rnd.core.type1;

import java.util.Arrays;
import java.util.stream.Stream;

public class Test3 {
  public static void main(String[] args) {
    String[] names = new String[] {"John", "Vidya", "Sam"};
    Stream<String> stream = Arrays.stream(names);
    // Get another Array of String with upper case
    String[] uppers = stream.map(s -> s.toUpperCase()).toArray(String[]::new);
    // Now print in stream way
    Arrays.stream(uppers).forEach(System.out::println);
  }
}
