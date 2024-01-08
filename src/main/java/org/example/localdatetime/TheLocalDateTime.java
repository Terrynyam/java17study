package org.example.localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * @author Terrance Nyamfukudza
 * 3/1/2024
 */
public class TheLocalDateTime {
    public static void main(String... args){
        // 2021-04-28T12:15
        LocalDateTime dt1 = LocalDateTime.of(2021, 4, 28, 12, 15);
        // 2021-08-19T14:00
        LocalDateTime dt2 = LocalDateTime.of(2021, Month.AUGUST, 19, 14, 0);
        System.out.println(dt1);
        System.out.println(dt2);

        LocalDate date1  = LocalDate.of(1969,7,20);
        LocalDateTime dt3 = LocalDateTime.of(date1, LocalTime.NOON); // 19
        LocalDateTime dt4 = LocalTime.of(12, 0).atDate(date1); // 19
        LocalDateTime dt5 = date1.atTime(LocalTime.NOON); // 19
        LocalDateTime dt6 = date1.atTime(12, 0);

        System.out.println(dt3);//1969-07-20T12:00
        System.out.println(dt4);//1969-07-20T12:00
        System.out.println(dt5+" and "+dt6);//1969-07-20T12:00

        LocalTime currentTime = LocalTime.now();
        LocalDate currentDate = LocalDate.now();
        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println(currentTime);//13:31:14.405530400
        System.out.println(currentDate);//2024-01-03
        System.out.println(currentDateTime);//2024-01-03T13:31:14.405530400
    }
}
