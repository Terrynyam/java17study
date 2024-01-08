package org.example.localdatetime;

import java.time.LocalDate;

/**
 * @author Terrance Nyamfukudza
 * 3/1/2024
 */
public class ComparingDatesAndTime {
    public static void main(String... args){
        LocalDate d1 = LocalDate.of(1948, 2, 28);
        LocalDate d2 = LocalDate.of(1949, 3, 1);

        System.out.println(d1.isBefore(d2)+" "+//true
         d2.isAfter(d1)+" "+//true
        d1.isAfter(d1)+" "+//false
        d1.isEqual(d2)+" "+//false
        d1.isEqual(d1)+" "+//true
        d1.isLeapYear());//true
    }
}
