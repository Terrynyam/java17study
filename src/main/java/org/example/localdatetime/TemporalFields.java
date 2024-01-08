package org.example.localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

/**
 * @author Terrance Nyamfukudza
 * 4/1/2024
 */
public class TemporalFields {
    public static void main(String... args){
        LocalDate date = LocalDate.of(2021, 8, 13);// 2021-08-13
        int monthValue = date.get(ChronoField.MONTH_OF_YEAR);
        System.out.println("Date " + date + " has month of the year: " + monthValue);
        // Date 2021-08-13 has month of the year: 8

        LocalDateTime dateTime = LocalDateTime.of(2021, 8, 13, 20, 20);
        System.out.print("Date-time " + dateTime);//2021-08-13T20:20
        dateTime = dateTime.with(ChronoField.DAY_OF_MONTH, 11)
                .with(ChronoField.MONTH_OF_YEAR, 1)
                .with(ChronoField.YEAR, 2022);
        System.out.println(" changed to: " + dateTime);
        // Date-time 2021-08-13T20:20 changed to: 2022-01-11T20:20
    }
}
