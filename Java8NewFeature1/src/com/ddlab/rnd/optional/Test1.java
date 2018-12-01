package com.ddlab.rnd.optional;

import java.util.Optional;

public class Test1 {
  public static void main(String[] args) {
    String sval = null;
    String name = "John";
    System.out.println("Optional.empty() : "+Optional.empty());//Optional.empty() : Optional.empty
    System.out.println("Optional.of(name) : "+Optional.of(name));//Optional.of(name) : Optional[John]
    System.out.println("Optional.of(sval) : "+Optional.of(sval));//Throws NullPointerException
    System.out.println("Optional.of(sval) : "+Optional.ofNullable(sval));//Optional.empty
  }
}
