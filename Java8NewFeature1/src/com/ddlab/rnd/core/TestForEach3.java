package com.ddlab.rnd.core;

import java.util.Arrays;
import java.util.List;

public class TestForEach3 {
  public static void main(String[] args) {
    List<String> words = Arrays.asList("America", "Amazon", "India", "CentOs 7");
    words.forEach(System.out::println); // Prints all the words in separate line

    System.out.println(words.stream().count());

    words.stream().forEach((s) -> System.out.println(s));
    System.out.println("----------------------");
    words.stream().filter(s -> s.startsWith("A")).forEach(s -> System.out.println(s));
    words.stream().filter(s -> s.startsWith("A")).forEach(System.out::println);

    // print length of each string using map()
    words.stream().mapToInt(s -> s.length()).forEach(System.out::println);

    // calculating sum of length of all string
    System.out.println("Total : " + words.stream().mapToInt(s -> s.length()).sum());
  }
}
