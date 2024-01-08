package org.example.localdatetime;

import java.time.LocalDate;
import java.time.Month;

/**
 * @author Terrance Nyamfukudza
 * 3/1/2024
 */
public class TheLocalDate {
    public static void main(String... args){
        LocalDate date1 = LocalDate.of(1969, 7, 20);//1969-07-20
        LocalDate date2 = LocalDate.of(-3113, Month.AUGUST, 11);//-3113-08-11 .corresponds to
        // 11 August 3114 BCE.

        // LocalDate date3 = LocalDate.of(2021, 13, 11); // DateTime
        // LocalDate date4 = LocalDate.of(2021, 2, 29); // DateTimeException
        System.out.println(date1);
        System.out.println(date2);
    }
}
