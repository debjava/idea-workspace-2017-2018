package com.ddlab.rnd.core.practice1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumeMap {

  public static void main(String[] args) {
      Map<String,String> map = new HashMap<>();
      map.put("1","Hati");
      map.put("2","Ghoda");
      map.put("3","Bagha");
      map.put("4","Chuha");
      map.put("5","Neula");
      map.put("6","Hiran");

      //display the contents of a Map
      BiConsumer<String,String> biConsumer = (k,v) -> System.out.println("Key : "+k+"--- Value : "+v);
//      map.forEach(biConsumer);

    // Another way of witing
      List<String> list1 = new ArrayList<>();
    BiConsumer<String, String> biConsumer1 =
        (key, value) -> {
          System.out.println("Key---->"+key);
          System.out.println("Value---->"+value);
            list1.add(value);
        };
      map.forEach(biConsumer1);
    System.out.println(list1);
  }
}
