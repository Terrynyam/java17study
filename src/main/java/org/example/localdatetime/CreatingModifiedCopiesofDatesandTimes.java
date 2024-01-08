package org.example.localdatetime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

/**
 * @author Terrance Nyamfukudza
 * 3/1/2024
 */
public class CreatingModifiedCopiesofDatesandTimes {
    public static void main(String... args){
        LocalDate date2 = LocalDate.of(2021, 3, 1); // 2021-03-01
        date2 = date2.withYear(2024).withMonth(2).withDayOfMonth(28); // 2024-02-28

        LocalDate date3 = LocalDate.of(2021, 3, 1); // 2021-03-01
        date3 = date3
                .with(ChronoField.YEAR, 2024L)
                .with(ChronoField.MONTH_OF_YEAR, 2L)
                .with(ChronoField.DAY_OF_MONTH, 28L);

        System.out.println(date2);//2024-02-28
        System.out.println(date3);//2024-02-28
    }
}
