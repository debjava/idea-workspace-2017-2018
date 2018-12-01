package com.ddlab.core1;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 * The type Test string joining 1.
 *
 * @author Debadatta Mishra
 */
public class TestStringJoining1 {

  public static String joinBy1(List<String> fruits, String separator) {
    StringBuilder sb = new StringBuilder();
    for (String fruit : fruits) sb.append(fruit).append(separator);
    String fruitsByComma = sb.toString();
    return fruitsByComma.substring(0, fruitsByComma.lastIndexOf(separator));
  }

  public static String joinBy2(List<String> fruits, String separator) {
    return fruits.toString().replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(",", separator);
  }

  public static String joinBy3(List<String> fruits, String separator) {
    return String.join(",", fruits);
  }

  public static String joinBy4(List<String> fruits, String separator) {
    StringJoiner strJoiner = new StringJoiner(",");
    for (String fruit : fruits) strJoiner.add(fruit);
    return strJoiner.toString();
  }

  public static String joinBy5(List<String> fruits, String separator) {
    return fruits.stream().map(fruit -> fruit).collect(Collectors.joining(separator));
  }

  public static void main(String[] args) {
    List<String> fruits = Arrays.asList("Apple", "Orange", "Kiwi", "Mango", "Banana");
    String allFruitsByComma = joinBy1(fruits, ",");
    System.out.println("All Fruits by Comma : " + allFruitsByComma);

    allFruitsByComma = joinBy2(fruits, ",");
    System.out.println("All Fruits by Comma : " + allFruitsByComma);

    allFruitsByComma = joinBy3(fruits, ",");
    System.out.println("All Fruits by Comma : " + allFruitsByComma);

    allFruitsByComma = joinBy4(fruits, ",");
    System.out.println("All Fruits by Comma : " + allFruitsByComma);

    allFruitsByComma = joinBy5(fruits, ",");
    System.out.println("All Fruits by Comma : " + allFruitsByComma);

    StringJoiner strJoiner = new StringJoiner("-", "{", "}");
    for (String fruit : fruits) strJoiner.add(fruit);
    System.out.println(strJoiner);

    String allF = fruits.stream().map(f -> f).collect(Collectors.joining("-", "{", "}"));
    System.out.println(allF);
  }
}
