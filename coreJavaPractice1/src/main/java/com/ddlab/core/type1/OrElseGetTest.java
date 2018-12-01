package com.ddlab.core.type1;

import java.util.Optional;

class A {
  public A() {
    System.out.println("A constructor called ...");
  }

  public A(String name) {
    System.out.println("A constructor called ..." + name);
  }
}

public class OrElseGetTest {

  public static void showCase1() {
    String name = null;
    Optional<String> opt = Optional.ofNullable(name);
    String value1 = opt.orElse("John");
    String value2 = opt.orElseGet(() -> "John");
    String value3 = opt.orElseGet(String::new);
    System.out.println(value1 + "---" + value2 + "---" + value3);

    name = "Hati";
    value1 = opt.orElse("John");
    value2 = opt.orElseGet(() -> "John");
    value3 = opt.orElseGet(String::new);
    System.out.println(value1 + "---" + value2 + "---" + value3);
  }

  public static void showCase2() {
    A a1 = null;
    Optional<A> opt = Optional.ofNullable(a1);
    A a2 = opt.orElse(new A());
    A a3 = opt.orElseGet(A::new);
    A a4 = opt.orElseGet(() -> new A("Hari"));
    System.out.println("----When object is not null----");
    a1 = new A("PP");
      Optional<A> opt1 = Optional.ofNullable(a1);
    a2 = opt1.orElse(new A());//Here it will create an object, even if the object is not null
    a3 = opt1.orElseGet(A::new);//It will not create an object, if the object is not null
    a4 = opt1.orElseGet(() -> new A("Hari"));//It will not create an object, if the object is not null
  }

  public static void main(String[] args) {
    showCase1();
    showCase2();
  }
}
