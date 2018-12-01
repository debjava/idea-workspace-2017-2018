package com.ddlab.rnd.defaultstatic;

public class Clazz implements Interface1, Interface2 {

  @Override
  public void perform() {}

  @Override
  public boolean isNull(String s) {
    return Interface2.super.isNull(s);
  }
}
