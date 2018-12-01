package com.ddlab.rnd;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Temp1 {

  public static String identifySwitch(String fileName, String regex) {
    String switchName = null;
    Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
    File logFile = new File(Temp1.class.getClassLoader().getResource(fileName).getFile());

    Scanner scanner = null;
    try {
      scanner = new Scanner(logFile);
      while (scanner.hasNextLine()) {
        String s1 = scanner.nextLine();
        System.out.println(s1);
        Matcher matcher = pattern.matcher(s1);
        if (matcher.find()) {
          // System.out.println("Found");

          String matched = matcher.group(0);
          switchName = matched;
          break;
          // System.out.println(matched);
        }
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } finally {
      if (scanner != null) scanner.close();
    }

    return switchName;
  }

  public static void main(String[] args) {
      String pattern = "\\b(?:DELL|BROCADE|CISCO)\\b";
      String logFileName = "Switch_Brocade_Log1.log";

      String switchName = identifySwitch(logFileName,pattern);
    System.out.println("Switch File Name =====>"+switchName);
  }
}
