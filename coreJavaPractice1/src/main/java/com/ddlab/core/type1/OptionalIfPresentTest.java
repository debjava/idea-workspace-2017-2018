package com.ddlab.core.type1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalIfPresentTest {

  public static void doSomeOps1(String name) {
    System.out.println("City Name : " + name);
  }

  public static void main(String[] args) {
    List<String> cityList = Arrays.asList("New Delhi", "Bangalore", "Agra", "Kolkata");
    List<String> cityList1 = Arrays.asList("New Delhi", "Agra", "Kolkata");
    Optional<String> itCityName =
        cityList.stream().filter(city -> city.equalsIgnoreCase("Bangalore")).findFirst();
    itCityName.ifPresent(OptionalIfPresentTest::doSomeOps1);

    itCityName = cityList1.stream().filter(city -> city.equalsIgnoreCase("Bangalore")).findFirst();
    itCityName.ifPresent(OptionalIfPresentTest::doSomeOps1);
  }
}
