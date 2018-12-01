package com.ddlab.rnd.optional;

import java.util.Optional;

public class Test2 {
  public static void main(String[] args) {
    String name = "john";
    Optional<String> nameOpt = Optional.ofNullable(name);
    if (nameOpt.isPresent()) System.out.println(nameOpt.get()); // john

    String value = null;
    Optional<String> someOpt = Optional.ofNullable(value);
    System.out.println("someOpt.get()---->" + someOpt.get()); // Throws NoSuchElementException: No value present

    Optional<String> nullOpt = Optional.ofNullable(null);
    nullOpt.ifPresent((s) -> System.out.println(s));//Nothing will be printed
    nullOpt.ifPresent(System.out::println);//Nothing will be printed

    Optional<String> valOpt = Optional.ofNullable("Abcd");
    valOpt.ifPresent((s) -> System.out.println(s));//Abcd
    valOpt.ifPresent(System.out::println);//Abcd
    System.out.println("Value :::"+valOpt.get());//Value :::Abcd

  }
}
