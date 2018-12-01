package com.ddlab.rnd.core.type1;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
  public static void main(String[] args) {
    List<String> emailLids = new ArrayList<>();
    emailLids.add("a@gmail.com");
    emailLids.add("b@gmail.com");
    emailLids.add("c@yahoo.com");
    emailLids.add("b@aol.com");
    emailLids.add("k@rediffmail.com");
    emailLids.add("b@gmail.com");

    // The allMatch()operation answers the question: Do all elements in the stream meet this
    // condition ? allMatch()
    boolean flag = emailLids.stream().allMatch(emailLid -> emailLid.endsWith("gmail.com"));
    System.out.println("Does it contain all gmail ids : " + flag);

    // Is there any element that meets this condition ? anyMatch()
    boolean flag1 = emailLids.stream().anyMatch(emailLid -> emailLid.endsWith("rediffmail.com"));
    System.out.println("Does list contain any rediffmail id ?" + flag1);

    // Does no element meet this condition ? noneMatch()
    boolean flag2 = emailLids.stream().noneMatch(emailLid -> emailLid.endsWith("zapak.com"));
    System.out.println("Does list contain any zapak id ?" + flag1);

    // http://www.codejava.net/java-core/collections/java-8-stream-terminal-operations-examples#anyMatch
      // https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html
      // http://java.amitph.com/2014/01/understanding-java-8-streams-api.html
  }
}
