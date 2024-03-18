package org.example.exampractice;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 * @author Terrance Nyamfukudza
 * 14/3/2024
 */
public class TimeAndDate {
    public static void main(String[] args) {
        Period p = Period.between( LocalDate.now(),LocalDate.of(2022, Month.SEPTEMBER, 1));
        System.out.println(p);
        //Compilation error on the below code because duration deals with time
        //and there is no time in LocalDate
        Duration d = Duration.between(LocalDate.now(),LocalDate.of(2022, Month.SEPTEMBER, 1));
        System.out.println(d);

    }
}
