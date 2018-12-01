package com.ddlab.core.type1;

import java.util.Optional;

public class OptionalUsage1 {

  public static String getMiddleName() {
    return "Arora";
    //return null;
  }

  public static String getFullName() {
      String fName = "John";
      String lName = "Abraham";
      String mName = null;
      Optional<String> middleNameOpt = Optional.ofNullable(getMiddleName());
      if( middleNameOpt.isPresent())
          mName = middleNameOpt.get();
      else
          mName = " ";
      return fName+" "+mName+" "+lName;
  }

  public static Integer getDiscount() {
    return 20;
  }

  public static Integer getAvailableDiscount() {
    Integer discountValue = null;
    Optional<Integer> discount = Optional.ofNullable(getDiscount());
    if (discount.isPresent()) discountValue = discount.get();
    else discountValue = 0;
    return discountValue;
  }

  public static void main(String[] args) {
    System.out.println("Now available discount ->" + getAvailableDiscount());
    System.out.println("Full Name ->"+getFullName());
  }
}
