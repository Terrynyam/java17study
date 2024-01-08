package org.example.localdatetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * @author Terrance Nyamfukudza
 * 4/1/2024
 */
public class UsingTemporalUnitsAndTemporalFields {
    public static void main(String... args){
        LocalDate date = LocalDate.of(2021, 10, 23);
        System.out.print("Date " + date);
        date = date.minus(10, ChronoUnit.MONTHS).minus(3, ChronoUnit.DAYS);
        System.out.println(" minus 10 months and 3 days: " + date);
        // Date 2021-10-23 minus 10 months and 3 days: 2020-12-20

        LocalTime time = LocalTime.of(14, 15);
        System.out.print("Time " + time);
        time = time.plus(9, ChronoUnit.HOURS).plus(70, ChronoUnit.MINUTES);
        System.out.println(" plus 9 hours and 70 minutes is " + time);
        // Time 14:15 plus 9 hours and 70 minutes is 00:25

        //Using the until method to compare dates
        LocalDate fromDate = LocalDate.of(2021, 3, 1);
        LocalDate xmasDate = LocalDate.of(2021, 12, 25);
        long tilChristmas = fromDate.until(xmasDate, ChronoUnit.DAYS);
        System.out.println("From " + fromDate + ", days until Xmas: " +tilChristmas);
        // From 2021-03-01, days until Xmas: 299
    }
}
