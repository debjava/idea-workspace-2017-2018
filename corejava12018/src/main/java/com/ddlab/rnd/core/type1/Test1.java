//package com.ddlab.rnd.core.type1;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//class Student {
//  private String name;
//
//  public Student(String name) {
//    this.name = name;
//  }
//
//  public String getName() {
//    return name;
//  }
//
//  @Override
//  public String toString() {
//    return this.name;
//  }
//}
//
//public class Test1 {
//
//  public static void copyNamesTraditionalWay(List<Student> studentsList) {
//    List<String> names = new ArrayList<>();
//    for (Student student : studentsList) {
//      if (student.getName().startsWith("A")) {
//        names.add(student.getName());
//      }
//    }
//    System.out.println("All Names : " + names);
//  }
//
//  public static void main(String[] args) {
//    List<Student> studentsList = new ArrayList<>();
//    studentsList.add(new Student("Alex"));
//    studentsList.add(new Student("Amazon"));
//    studentsList.add(new Student("Bobly"));
//    studentsList.add(new Student("Alice"));
//    studentsList.add(new Student("Sunder"));
//    copyNamesTraditionalWay(studentsList);
//
//    // Display all the names from Student List
//    studentsList.stream().forEach(System.out::println);
//    System.out.println("============Using static method================");
//    studentsList.stream().forEach(Demo1::show);
//    System.out.println("-----------Using instance method----------------");
//    studentsList.stream().forEach(new Demo2()::show);
//    System.out.println("------------Using map() method----------------");
//    studentsList.stream().map(Student::getName).forEach(System.out::println);
//    int totalFilteredName =
//        (int) studentsList.stream().map(Student::getName).filter(s -> s.startsWith("A")).count();
//    System.out.println("Total Filtered Names : " + totalFilteredName);
//
//    List<String> filteredNamesList =
//        studentsList
//            .stream()
//            .map(Student::getName)
//            .filter(s -> s.startsWith("A"))
//            .collect(Collectors.toList());
//    System.out.println(filteredNamesList);
//
//    // http://java.amitph.com/2014/01/understanding-java-8-streams-api.html
//    // https://www.tutorialspoint.com/java8/java8_streams.htm
//  }
//}
