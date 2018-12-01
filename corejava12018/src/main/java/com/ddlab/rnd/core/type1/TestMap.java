package com.ddlab.rnd.core.type1;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Developers {
  private String name;
  private String lang;

  public Developers(String name, String lang) {
    this.name = name;
    this.lang = lang;
  }

  public String getLang() {
    return lang;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return name;
  }
}

class JavaDevelopers extends Developers {
  public JavaDevelopers(String name, String lang) {
    super(name, lang);
  }

  @Override
  public String toString() {
    return MessageFormat.format("{0}---{1}", getName(), getLang());
  }
}

class PythonDevelopers extends Developers {
  public PythonDevelopers(String name, String lang) {
    super(name, lang);
  }

  @Override
  public String toString() {
    return MessageFormat.format("{0}---{1}", getName(), getLang());
  }
}

public class TestMap {
  public static void main(String[] args) {
    List<Developers> developers =
        Arrays.asList(
            new Developers("John", "Java"),
            new Developers("Vidya", "Python"),
            new Developers("Sangram", "Java"),
            new Developers("Natalia", "Python"));

    List<JavaDevelopers> javaDevelopers =
        developers
            .stream()
            .map(
                t -> {
                  JavaDevelopers jd = null;
                  if (t.getLang().equals("Java")) {
                    jd = new JavaDevelopers(t.getName(), t.getLang());
                  }
                  return jd;
                })
            .filter(t -> t != null)
            .collect(Collectors.toList());
    System.out.println("List of java developers : " + javaDevelopers);
  }
}
