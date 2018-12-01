package com.ddlab.rnd.core.fns.type1;

public class Item {
  private String name;

  public Item() {}

  public Item(String name) {
    this.name = name;
  }

  public static String getStaticVal() {
    return "Static Val";
  }

  public String getMsg() {
    return "Hello World!";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
