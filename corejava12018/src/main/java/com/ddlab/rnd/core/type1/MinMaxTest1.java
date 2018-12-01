package com.ddlab.rnd.core.type1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee1 {
  private String name;
  private int age;
  private int sal;

  public Employee1(String name, int age, int sal) {
    this.name = name;
    this.age = age;
    this.sal = sal;
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

  @Override
  public String toString() {
    return "Employee1{" + "name='" + name + '\'' + ", age=" + age + ", sal=" + sal + '}';
  }
}

public class MinMaxTest1 {
  public static void main(String[] args) {
    List<Employee1> empList =
        Arrays.asList(
            new Employee1("John", 23, 1234),
            new Employee1("Vidya", 33, 3345),
            new Employee1("Ram", 43, 4567),
            new Employee1("Hari", 27, 5550),
            new Employee1("Shyam", 13, 1000));
    Employee1 minEmp = empList.stream().min(Comparator.comparing(Employee1::getAge)).get();
    System.out.println("Most Junior Employee : "+minEmp);

    Employee1 maxEmpSal = empList.stream().max(Comparator.comparing(Employee1::getSal)).get();
    System.out.println("Who is drawing more salary ? "+maxEmpSal);
  }

  //http://java.amitph.com/2014/01/understanding-java-8-streams-api.html
    // https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html
}
