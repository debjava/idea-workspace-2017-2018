package com.ddlab.rnd.core.type1;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return MessageFormat.format("{0}---{1}", name, age);
  }
}

class Student {
  private Person person;

  public Student(Person person) {
    this.person = person;
  }

  @Override
  public String toString() {
    return MessageFormat.format("{0}---{1}", person.getName(), person.getAge());
  }
}

public class TestMap1 {
  public static void main(String[] args) {
    List<Person> personList =
        Arrays.asList(
            new Person("John", 23),
            new Person("Vidya", 27),
            new Person("Ram", 33),
            new Person("Chitra", 43));

    // One way of writing like this
    Stream<Student> studentStream =
        personList
            .stream()
            .filter(t -> t.getAge() > 30)
            .map(
                new Function<Person, Student>() {
                  @Override
                  public Student apply(Person person) {
                    return new Student(person);
                  }
                });

    List<Student> studentList = studentStream.collect(Collectors.toList());
    System.out.println(studentList);

    // Lambda style of writing
    Stream<Student> studentStream1 =
        personList.stream().filter(p -> p.getAge() > 30).map(person -> new Student(person));
    studentList = studentStream1.collect(Collectors.toList());
    System.out.println(studentList);

    // Best of writing
    Stream<Student> students = personList.stream().filter(p -> p.getAge() > 30).map(Student::new);
    studentList = studentStream1.collect(Collectors.toList());
    System.out.println(studentList);
  }
}
