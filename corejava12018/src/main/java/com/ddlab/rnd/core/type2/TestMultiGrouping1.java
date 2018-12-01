package com.ddlab.rnd.core.type2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class CorpEmployee {
  private String name;
  private String city;
  private int age;
  private String gender;

  public CorpEmployee(String name, String city, int age, String gender) {
    this.name = name;
    this.city = city;
    this.age = age;
    this.gender = gender;
  }

  public String getName() {
    return name;
  }

  public String getCity() {
    return city;
  }

  public int getAge() {
    return age;
  }

  public String getGender() {
    return gender;
  }

  @Override
  public String toString() {
    return "CorpEmployee{"
        + "name='"
        + name
        + '\''
        + ", city='"
        + city
        + '\''
        + ", age="
        + age
        + ", gender='"
        + gender
        + '\''
        + '}';
  }
}

public class TestMultiGrouping1 {

  public static void ops1() {
    Function<Person, List<Object>> compositeKey =
        personRecord -> Arrays.<Object>asList(personRecord.getName(), personRecord.getAge());
  }

  public static void main(String[] args) {
    List<CorpEmployee> empList =
        Arrays.asList(
            new CorpEmployee("Rita", "Bangalore", 23, "FEMALE"),
            new CorpEmployee("Rahul", "Chennai", 43, "MALE"),
            new CorpEmployee("Rashmi", "Chennai", 23, "FEMALE"),
            new CorpEmployee("Sanukta", "Bangalore", 33, "FEMALE"),
            new CorpEmployee("John", "Hyderabad", 33, "MALE"),
            new CorpEmployee("Akash", "Hyderabad", 23, "MALE"));
    // Group by Gender
    Map<String, List<CorpEmployee>> genderMap =
        empList.stream().collect(Collectors.groupingBy(CorpEmployee::getGender));
    System.out.println(genderMap);

    // Group by gender and then by age
    Map<String, Map<Integer, List<CorpEmployee>>> genderAgeMap =
        empList
            .stream()
            .collect(
                Collectors.groupingBy(
                    CorpEmployee::getGender, Collectors.groupingBy(CorpEmployee::getAge)));

    System.out.println(genderAgeMap);

    // Group by gender, age and then by city
    Map<String, Map<Integer, Map<String, List<CorpEmployee>>>> genderAgeCityMap =
        empList
            .stream()
            .collect(
                Collectors.groupingBy(
                    CorpEmployee::getGender,
                    Collectors.groupingBy(
                        CorpEmployee::getAge, Collectors.groupingBy(CorpEmployee::getCity))));

    System.out.println(genderAgeCityMap);

  }
}
