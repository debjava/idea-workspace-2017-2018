package com.ddlab.rnd.core.fns.type1;

import java.util.function.Supplier;

public class SupplierReturnObject {
  public static void main(String[] args) {
    Supplier<Item> supplier = Item::new;
    Item item = supplier.get();
    System.out.println(item.getMsg());
  }
}
