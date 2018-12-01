package com.ddlab.rnd.lambdaex;

interface Validator {
  void validate();
}

public class Test1 {

  public static void main(String[] args) {

    // Without lambda expression
    Validator validator =
        new Validator() {
          @Override
          public void validate() {
            System.out.println("Doing validation ...");
          }
        };
    validator.validate();

    // With Lambda expression
    Validator validator1 =
        () -> {
          System.out.println("Doing lambda validation ...");
        };
    validator1.validate();
  }
}
