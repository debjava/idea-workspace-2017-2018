package com.ddlab.core.type1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalUsage2 {

  public static void printITCity(List<String> cityList) {
    Optional<String> itCityName =
        cityList.stream().filter(city -> city.equalsIgnoreCase("Bangalore")).findFirst();
    String cityName = null;
    cityName = itCityName.isPresent() ? itCityName.get() : "No City Found";
    System.out.println("IT City of India : " + cityName);
  }

  public static void printITCity1(List<String> cityList) {
    Optional<String> itCityName =
        cityList.stream().filter(city -> city.equalsIgnoreCase("Bangalore")).findFirst();
    String cityName = null;
    cityName = itCityName.orElse("No IT City Found");
    System.out.println("IT City of India : " + cityName);
  }

  public static void performOps1(List<String> cityList) {
    Optional<String> itCityName =
        cityList.stream().filter(city -> city.equalsIgnoreCase("Bangalore")).findFirst();
    itCityName.ifPresent(OptionalUsage2::doSomeOps1);
  }

  private static void doSomeOps1(String name) {
    System.out.println("City Name : " + name);
  }

  public static void throwSomeException(List<String> cityList) {
    Optional<String> itCityName =
        cityList.stream().filter(city -> city.equalsIgnoreCase("Bangalore")).findFirst();
    String name = itCityName.orElseThrow(() -> new RuntimeException("Value is not found"));
    System.out.println("Now name : " + name);
  }

  public static void main(String[] args) {
    List<String> cityList = Arrays.asList("New Delhi", "Bangalore", "Agra", "Kolkata");
    printITCity(cityList);
    List<String> cityList1 = Arrays.asList("New Delhi", "Agra", "Kolkata");
    printITCity(cityList1);
    printITCity1(cityList1);
    performOps1(cityList);
    performOps1(cityList1);
    throwSomeException(cityList);
    throwSomeException(cityList1);
  }
}
