package com.booking.utils;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class pruebas {

    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();

        LocalDate fechaModificada = fechaActual.plusDays(2);

        // Formatear la fecha si es necesario
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String fechaFormateada = fechaModificada.format(formato);

        // Imprimir la fecha
        System.out.println("Fecha actual: " + fechaFormateada);
    }
}
