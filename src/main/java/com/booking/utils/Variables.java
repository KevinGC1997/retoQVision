package com.booking.utils;

import java.io.IOException;

public class Variables {
    DataExcel data = new DataExcel();


    public int adult;
    public int child;
    public int rooms;
    public int stars;


    {
        try {
            adult = (int) Double.parseDouble(data.readExcelData("Data","data.xlsx",1,1));
            rooms = (int) Double.parseDouble(data.readExcelData("Data","data.xlsx",1,2));
            child = (int) Double.parseDouble(data.readExcelData("Data","data.xlsx",1,3));
            stars = (int) Double.parseDouble(data.readExcelData("Data", "data.xlsx",1,5));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
