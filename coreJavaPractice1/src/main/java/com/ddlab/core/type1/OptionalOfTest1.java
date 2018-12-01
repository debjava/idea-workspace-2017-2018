package com.ddlab.core.type1;

import java.util.Optional;

public class OptionalOfTest1 {
  public static void main(String[] args) {
    String s1 = new String("John");
    Optional<String> name1 = Optional.of(s1);
    System.out.println("Name : " + name1.get());

    String s2 = null;
    Optional<String> name2 = Optional.of(s2);//It throws NullPointerException here
    System.out.println("Name : " + name2.get());
  }
}
