package com.ddlab.rnd.defaultstatic;

public interface Interface1 {
  void perform();

  default boolean isNull(String s) {
    return s == null;
  }

  static void show() {
    System.out.printf("Show method of Interface 1");
  }
}
