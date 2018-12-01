package com.ddlab.rnd.doublecolon;

interface Zoo {

  Animal getAnimal(String name);
}

public class Animal {
  private String name;

  public Animal(String name) {
    this.name = name;
  }

  public String getType() {
    return "Mamal";
  }

  public static void main(String[] args) {
    Zoo zoo = Animal::new;
    Animal animal = zoo.getAnimal("Lion");
    System.out.println(animal.getType());
  }
}
