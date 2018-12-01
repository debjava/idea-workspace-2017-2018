package com.ddlab.rnd.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestForEach1 {

  public static void showForEachForMap() {
    Map<String, Integer> map = new HashMap<>();
    for (int i = 65; i < 70; i++) {
      map.put(String.valueOf((char) i), i);
    }

    // Traditional way to print all values of Map
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
    }

    // Now print the map using foreach
    map.forEach((k, v) -> System.out.println("Key:" + k + "---" + "Value:" + v));
  }

  public static void showForEachForMapSpecialCase() {
    Map<String, Integer> map = new HashMap<>();
    for (int i = 65; i < 70; i++) {
      map.put(String.valueOf((char) i), i);
    }

    map.forEach(
        (k, v) -> {
          System.out.println("********* values **********");
          System.out.println(k + "----" + v);
        });
  }

  public static void showForEachList() {
    List<String> list = new ArrayList<>();
    for (int i = 65; i < 70; i++) {
      list.add(String.valueOf((char) i));
    }

    list.forEach((item) -> System.out.println("Value : " + item));

    // Special Case
    list.forEach(
        (item) -> {
          System.out.println("--->" + item);
        });
  }

  public static void main(String[] args) {
    //    showForEachForMap();
    //    showForEachForMapSpecialCase();
    showForEachList();
  }
}
