package com.ddlab.rnd.doublecolon;

interface i1 {
  String getString1(String s);
}

interface i2 {
  String getString2(String s);
}

interface i3 {

  int getVal(int a);

  String getString(String s);
}

class A {

  public A() {}

  public String getString1(String s) {
    return s;
  }
}

public class Test2 {

  public static void main(String[] args) {
    i1 ii1 = new A()::getString1;
    String s = ii1.getString1("abcd");
    System.out.println(s);
  }
}
