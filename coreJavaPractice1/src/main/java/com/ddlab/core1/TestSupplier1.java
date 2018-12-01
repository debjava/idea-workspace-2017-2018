package com.ddlab.core1;

import java.io.File;
import java.util.function.Supplier;

public class TestSupplier1 {
  public static void main(String[] args) {
    Supplier<File> fileSupplier = () -> new File(".");
    File file1 = fileSupplier.get();
    System.out.println(file1.getAbsolutePath());





  }
}
