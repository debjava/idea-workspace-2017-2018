package com.ddlab.rnd.core.fns.type1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SupplierWithStream {
  public static void main(String[] args) {
    List<Item> list = new ArrayList<>();
    list.add(new Item("AA"));
    list.add(new Item("BB"));
    list.add(new Item("CC"));
    Stream<String> names = list.stream().map(Item::getName);
    names.forEach(n -> System.out.println(n));
  }
}
