package com.ddlab.core1;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TestCSVReader {
  public static void main(String[] args) throws Exception {
    Path filePath = Paths.get("C:\\Users\\PIKU\\Desktop\\a.csv");
    List<String> fileLines = Files.readAllLines(filePath);
    for(String line : fileLines) {
      String[] splittedLines = line.split("[,]");
      String formedLine = "insert into ARCHIV_PART_TABLES values("
              +
              splittedLines[0]
              +","
              +"\'"+splittedLines[1]+"\'"
              +","
              +"\'"+splittedLines[2]+"\'"
              +","
              +"\'"+splittedLines[3]+"\'"
              +");";
      System.out.println(formedLine);
    }
  }
}
