package com.ddlab.rnd.core.type2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person {
  private String name;
  private int age;
  private int sal;
  private String city;

  public Person(String name, int age, int sal, String city) {
    this.name = name;
    this.age = age;
    this.sal = sal;
    this.city = city;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public int getSal() {
    return sal;
  }

  public String getCity() {
    return city;
  }

  @Override
  public String toString() {
    return "Person{"
        + "name='"
        + name
        + '\''
        + ", age="
        + age
        + ", sal="
        + sal
        + ", city='"
        + city
        + '\''
        + '}';
  }
}

public class TestGroupByObjects1 {
  public static void main(String[] args) {
    List<Person> personList =
        Arrays.asList(
            new Person("John", 23, 1234, "Bangalore"),
            new Person("Vidya", 23, 4456, "Chennai"),
            new Person("Safari", 42, 1234, "Bangalore"),
            new Person("Rahul", 33, 4456, "Bangalore"),
            new Person("Rohit", 23, 1234, "Chennai"),
            new Person("Sam", 42, 5550, "Hyderabad"));

    // Group by Age
    Map<Integer, List<Person>> peopleByAge =
        personList.stream().collect(Collectors.groupingBy(Person::getAge));
    System.out.println(peopleByAge);

    // Group by City
    Map<String, List<Person>> grpByCity =
        personList.stream().collect(Collectors.groupingBy(Person::getCity));
    System.out.println(grpByCity);
  }
}
