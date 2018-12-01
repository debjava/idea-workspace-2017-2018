package com.ddlab.rnd.core2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Developer {
  private int age;
  private String name;

  public Developer(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  // get / set methods

  @Override
  public String toString() {
    return "Developer{" + "name='" + name + '\'' + '}';
  }
}

public class Test1 {
  public static void main(String[] args) {
    List<Developer> team =
        Arrays.asList(
            new Developer(28, "Sam"),
            new Developer(23, "John"),
            new Developer(35, "Vidya"),
            new Developer(50, "Peter"),
            new Developer(50, "Suhasini"));

    Map<Boolean, List<Developer>> dataMap =
        team.stream().collect(Collectors.partitioningBy(d -> d.getAge() > 30));
    System.out.println("List of Senior developers : " + dataMap.get(true));
    System.out.println("List of Junior developers : " + dataMap.get(false));
  }
}
