package com.ddlab.rnd;

import java.io.Console;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

  public static void main(String[] args) {

      String s = "A IU DELLsomehting Cisco PRI something RET whatever";
      Pattern p= Pattern.compile("\\b(?:DELL|BROCADE|CISCO)\\b", Pattern.CASE_INSENSITIVE);
      Matcher m= p.matcher(s);
      if( m.find() ) {
      System.out.println("Found");

          String matched= m.group(0);
          System.out.println(matched);
      }

//      while (m.find()) {
//          String matched= m.group(0);
//          System.out.println(matched);
//      }
  }
}
