package com.ddlab.rnd;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.FileOutputStream;

public class TestXls {

  public static void main(String[] args) throws Exception {
      Workbook wb = new HSSFWorkbook();
      Sheet sheet1 = wb.createSheet("new sheet");
      CreationHelper createHelper = wb.getCreationHelper();
      Row row = sheet1.createRow((short)0);
      // Create a cell and put a value in it.
      Cell cell = row.createCell(0);
      cell.setCellValue(1);

      row.createCell(1).setCellValue(1.2);
      row.createCell(2).setCellValue(
              createHelper.createRichTextString("This is a string"));
      row.createCell(3).setCellValue(true);

      FileOutputStream fileOut = new FileOutputStream("workbook.xlsx");
      wb.write(fileOut);
      fileOut.close();
  }
}
