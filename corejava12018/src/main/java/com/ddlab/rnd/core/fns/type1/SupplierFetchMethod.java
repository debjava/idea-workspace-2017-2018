package com.ddlab.rnd.core.fns.type1;

import java.util.function.Supplier;

public class SupplierFetchMethod {
  public static void main(String[] args) {
    Supplier<String> supplier = Item::getStaticVal;
    String val = supplier.get();
    System.out.println("Calling  Method:" + val);
  }
}
