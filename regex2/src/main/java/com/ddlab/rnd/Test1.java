package com.ddlab.rnd;

import java.io.File;
import java.util.Scanner;

public class Test1 {

  public static void readFile(String fileName) throws Exception {
    File logFile = new File(Test1.class.getClassLoader().getResource(fileName).getFile());
    Scanner scanner = new Scanner(logFile);

    while (scanner.hasNextLine()) {
      String s1 = scanner.nextLine();
      System.out.println(s1);
    }
    if (scanner != null) {
      scanner.close();
    }


  }

  public static void main(String[] args) throws Exception {

    readFile("Switch_Brocade_Logs.log");


//    Scanner scanner = new Scanner(new File("Switch_Brocade_Logs.log"));
//    File logFile = new File(getClass().getClassLoader().getResource("Switch_Brocade_Logs.log").getFile());
//
//    while (scanner.hasNextLine()) {
//      String s1 = scanner.nextLine();
//      System.out.println(s1);
//    }
//    if (scanner != null) {
//      scanner.close();
//    }
  }
}
