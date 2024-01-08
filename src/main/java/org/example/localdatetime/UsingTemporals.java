package org.example.localdatetime;

import java.time.*;
import java.time.temporal.ChronoField;

/**
 * @author Terrance Nyamfukudza
 * 3/1/2024
 */
public class UsingTemporals {
    public static void main(String[] args) {
// Date-Time: 1945-08-06T08:15
        LocalDateTime doomsday = LocalDateTime.of(1945, 8, 6, 8, 15);
        LocalDate date = doomsday.toLocalDate(); // 1
        LocalTime time = doomsday.toLocalTime(); // 0
        System.out.println("Date-Time: " + doomsday);
        System.out.println();
// Time: 08:15
        int hourOfDay = time.getHour(); // 8
        int minuteOfHour1 = time.getMinute(); // 1
        int minuteOfHour2 = time.get(ChronoField.MINUTE_OF_HOUR); // 1
        int secondOfMinute = time.getSecond(); // 0
        System.out.println("Time of day: " + time);
        System.out.println("Hour-of-day: " + hourOfDay);
        System.out.println("Minute-of-hour 1: " + minuteOfHour1);
        System.out.println("Minute-of-hour 2: " + minuteOfHour2);
        System.out.println("Second-of-minute: " + secondOfMinute);
        System.out.println();
// Date: 1945-08-06
        int year = date.getYear(); // 1
        int monthVal1 = date.getMonthValue(); // 8
        int monthVal2 = date.get(ChronoField.MONTH_OF_YEAR); // 8
        Month month = date.getMonth(); // A
        DayOfWeek dow = date.getDayOfWeek(); // M
        int day = date.getDayOfMonth(); //
        System.out.println("Date: " + date);
        System.out.println("Year: " + year);
        System.out.println("Month value 1: " + monthVal1);
        System.out.println("Month value 2: " + monthVal2);
        System.out.println("Month-of-year: " + month);
        System.out.println("Day-of-week: " + dow);
        System.out.println("Day-of-month: " + day);
        System.out.println();
// Ordering
        LocalDate d1 = LocalDate.of(1948, 2, 28); // 1
        LocalDate d2 = LocalDate.of(1949, 3, 1); // 1
        boolean result1 = d1.isBefore(d2); // t
        boolean result2 = d2.isAfter(d1); // t
        boolean result3 = d1.isAfter(d1); // f
        boolean result4 = d1.isEqual(d2); // f
        boolean result5 = d1.isEqual(d1); // t
        boolean result6 = d1.isLeapYear(); // t
        System.out.println("Ordering:");
        System.out.println(d1 + " is before " + d2 + ": " + result1);
        System.out.println(d2 + " is after " + d1 + ": " + result2);
        System.out.println(d1 + " is after " + d1 + ": " + result3);
        System.out.println(d1 + " is equal to " + d2 + ": " + result4);
        System.out.println(d1 + " is equal to " + d1 + ": " + result5);
        System.out.println(d1.getYear() + " is a leap year: " + result6);
                System.out.println();
        System.out.println("Using absolute adjusters:");
        LocalDate date2 = LocalDate.of(2021, 3, 1);
        System.out.println("Date before adjusting: " + date2); // 2
        date2 = date2.withYear(2024).withMonth(2).withDayOfMonth(28);
        System.out.println("Date after adjusting: " + date2); // 2
        System.out.println();
        System.out.println("Using temporal fields:");
        LocalDate date3 = LocalDate.of(2021, 3, 1);
        System.out.println("Date before adjusting: " + date3); // 2
        date3 = date3
                .with(ChronoField.YEAR, 2024L)
                .with(ChronoField.MONTH_OF_YEAR, 2L)
                .with(ChronoField.DAY_OF_MONTH, 28L);
        System.out.println("Date after adjusting: " + date3); // 2
    }
}
