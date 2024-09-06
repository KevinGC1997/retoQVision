package com.booking.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GenerateCurrentDate {


    public String CurrentData(int num) {

        LocalDate currentDate = LocalDate.now();
        LocalDate modifiedDate = currentDate.plusDays(num);
        // Formatear la fecha si es necesario
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        return modifiedDate.format(format);
    }
}
