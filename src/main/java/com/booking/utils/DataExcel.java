package com.booking.utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DataExcel {

    private static XSSFWorkbook book;
    private static FileInputStream file;


    public String readExcelData(String hoja, String ruta, int rowValue, int cellValue) throws IOException {

        String valor = null;
        file = new FileInputStream(new File(ruta));
        book = new XSSFWorkbook(file);
        Sheet sheet = book.getSheet(hoja);
        Row row = sheet.getRow(rowValue);
        Cell cell = row.getCell(cellValue);
        switch (cell.getCellTypeEnum()){
            case STRING:
                valor = cell.getStringCellValue();
                break;
            case NUMERIC:
                valor = String.valueOf(cell.getNumericCellValue());

                break;
        }
        //valor = cell.getStringCellValue();
        book.close();
        file.close();
        return valor;
    }


}
