package org.example.exampractice;

import java.time.*;

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
//        Duration d = Duration.between(LocalDate.now(),LocalDate.of(2022, Month.SEPTEMBER, 1));
//        System.out.println(d);
        LocalTime startTime = LocalTime.of(10, 0);
        LocalTime endTime = LocalTime.of(15, 30);
        Duration duration = Duration.between(startTime, endTime);
        System.out.println(duration);

    }
}
