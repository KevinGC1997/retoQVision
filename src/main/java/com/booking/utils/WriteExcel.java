package com.booking.utils;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;


import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;


public class WriteExcel {

    static Map<String, Object[]> datos;

    public WriteExcel() {
    }

    public static void WriteExcel(Map<String, Object[]> datos) {


        Workbook workbook = new XSSFWorkbook();
        //Crea hoja nueva
        Sheet sheet = workbook.createSheet("Hoja de datos");


        Set<String> keyset = datos.keySet();
        int numeroRenglon = 0;
        for (String key : keyset) {
            Row row = sheet.createRow(numeroRenglon++);
            Object[] arregloObjetos = datos.get(key);
            int numeroCelda = 0;
            for (Object obj : arregloObjetos) {
                Cell cell = row.createCell(numeroCelda++);
                if (obj instanceof String) {
                    cell.setCellValue((String) obj);
                } else if (obj instanceof Integer) {
                    cell.setCellValue((Integer) obj);
                }
            }
        }
        try {
            //Se genera el documento
            FileOutputStream out = new FileOutputStream(new File("dataSave.xlsx"));
            workbook.write(out);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
