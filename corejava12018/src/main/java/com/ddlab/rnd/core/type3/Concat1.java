package com.ddlab.rnd.core.type3;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Concat1 {
  public static void main(String[] args) {
    Stream<String> a = Stream.of("one", "two");
    Stream<String> b = Stream.of("three", "four");
    Stream<String> out = Stream.concat(a, b);
    List<String> list = out.collect(Collectors.toList());
    System.out.println(list);
    list.stream().forEach(x -> System.out.print(x+"\t"));
  }
}
