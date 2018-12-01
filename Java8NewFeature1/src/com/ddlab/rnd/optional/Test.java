package com.ddlab.rnd.optional;

import java.util.Optional;

public class Test {
  public static void main(String[] args) {
    Optional<String> s = Optional.of("input");
    System.out.println(s.map(Test::getOutput));//Optional[output for input]
    System.out.println(s.flatMap(Test::getOutputOpt));//Optional[output for input]
  }

  static Optional<String> getOutputOpt(String input) {
    return input == null ? Optional.empty() : Optional.of("output for " + input);
  }

  static String getOutput(String input) {
    return input == null ? null : "output for " + input;
  }
}
