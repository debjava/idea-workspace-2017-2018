package com.ddlab.core.type1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalTest1 {

  public static void checkTraditionalWay(List<String> namesList) {
    String pName =
        namesList.stream().filter(name -> name.equals("John")).collect(Collectors.toList()).get(0);
    if (pName != null) System.out.println("John passed ...");
    else System.out.println("John failed ...");
  }

  public static void checkJava8Way1(List<String> namesList) {
    Optional<String> nameOpt = namesList.stream().filter(name -> name.equals("John")).findFirst();
    if (nameOpt.isPresent()) System.out.println("John Passed ...");
    else System.out.println("John failed ...");
  }

  public static String getPassStatus(List<String> namesList) {
    Optional<String> nameOpt = namesList.stream().filter(name -> name.equals("John")).findFirst();
    return nameOpt.orElse("Failed");
  }

  public static void main(String[] args) {
    List<String> names = Arrays.asList("John","Vidya", "Ravina", "Suraj");
    checkTraditionalWay(names);
      names = Arrays.asList("Vidya", "Ravina", "Suraj");
    checkJava8Way1(names);
    System.out.println(getPassStatus(names));
  }
}
