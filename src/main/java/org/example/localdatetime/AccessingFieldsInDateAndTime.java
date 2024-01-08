package org.example.localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

/**
 * @author Terrance Nyamfukudza
 * 3/1/2024
 */
public class AccessingFieldsInDateAndTime {
    public static void main(String... args){
        LocalTime time = LocalTime.of(8,15);
        LocalDate date = LocalDate.of(1945,8,6);
        int minuteOfHour1 = time.getMinute(); // 15
        int minuteOfHour2 = time.get(ChronoField.MINUTE_OF_HOUR);//15
        int monthVal1 = date.getMonthValue(); // 8
        int monthVal2 = date.get(ChronoField.MONTH_OF_YEAR);//8
        System.out.println(minuteOfHour1+" and "+minuteOfHour2);
        System.out.println(monthVal1+" and "+monthVal2);

        //Accessing fields
        LocalDateTime doomsday = LocalDateTime.of(1945, 8, 6, 8, 15);
        LocalTime timer = doomsday.toLocalTime();
        LocalDate dates = doomsday.toLocalDate();
        System.out.println(timer+" and "+dates);

        //The following two methods return the number of days in the month and in the
        // year represented by a LocalDate object.

        LocalDate foolsday = LocalDate.of(2022, 4, 1);
        int daysInMonth = foolsday.lengthOfMonth(); // 30 number of days in month of April
        int daysInYear = foolsday.lengthOfYear();//365
        System.out.println(daysInMonth+" and "+daysInYear);
    }
}
