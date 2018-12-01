package com.ddlab.rnd.optional;

import java.util.Optional;

public class Test3 {
  public static void main(String[] args) {
      Optional<String> nonEmptyGender = Optional.of("male");
      Optional<String> emptyGender = Optional.empty();

      System.out.println("Non-Empty Optional:: " + nonEmptyGender.map(String::toUpperCase));//Non-Empty Optional:: Optional[MALE]

      System.out.println("Empty Optional    :: " + emptyGender.map(String::toUpperCase));//Empty Optional    :: Optional.empty

//      nonEmptyGender.flatMap()


  }
}
