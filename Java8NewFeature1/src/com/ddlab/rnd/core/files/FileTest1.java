package com.ddlab.rnd.core.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileTest1 {

  /** One liner file reading in java 8 */
  public static void readNShowFile(String filePath) throws IOException {
    String content = new String(Files.readAllBytes(Paths.get(filePath)));
    System.out.println(content);
  }

  /** Read a file line by line */
  public static void readFileLineByLine(String filePath) {
    try (Stream<String> stream = Files.lines(Paths.get(filePath))) {
      stream.forEach(
          s -> {
            System.out.println(s);
          });
    } catch (IOException ie) {
      ie.printStackTrace();
    }
  }

  /**
   * Convert to upper case and collect as list
   *
   * @param filePath
   */
  public static void showSpecialOperation(String filePath) {
    List<String> list = new ArrayList<>();
    try (Stream<String> stream = Files.lines(Paths.get(filePath))) {
      list =
          stream
              .filter(line -> !line.startsWith("line3"))
              .map(String::toUpperCase)
              .collect(Collectors.toList());
    } catch (IOException ie) {
      ie.printStackTrace();
    }
    list.forEach(System.out::println);
  }

  /**
   * A new method lines() has been added since 1.8, it lets BufferedReader returns content as
   * Stream.
   *
   * @param filePath
   */
  public static void buffReaderToList(String filePath) {
    List<String> list = new ArrayList<>();
    try (BufferedReader br = Files.newBufferedReader(Paths.get(filePath))) {
      // br returns as stream and convert it into a List
      list = br.lines().collect(Collectors.toList());
    } catch (IOException e) {
      e.printStackTrace();
    }
    list.forEach(System.out::println);
  }

  /**
   * One liner file writing in java 8
   *
   * @throws IOException
   */
  public static void writeToFile1() throws IOException {
    String text = "Text to save to file";
    Files.write(Paths.get("./fileName.txt"), text.getBytes());
  }

  public static void main(String[] args) throws IOException {
    // Gets the current directory
    System.out.println("-->" + Paths.get("").toAbsolutePath());

    String fileName1 = "E:/idea-ws-2017/Java8NewFeature1/resources/a.txt";
    String fileName2 = "E:/idea-ws-2017/Java8NewFeature1/resources/b.txt";
    readNShowFile(fileName1);
    readFileLineByLine(fileName1);
    showSpecialOperation(fileName2);
    buffReaderToList(fileName2);
    writeToFile1();
  }
}
