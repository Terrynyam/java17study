package org.example.localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * @author Terrance Nyamfukudza
 * 4/1/2024
 */
public class TemporalArithmeticOfDates {
    public static void main(String... args){
        LocalDate date = LocalDate.of(2021, 10, 23); // 2021-10-23

        date = date.plusMonths(10).plusWeeks(3).plusDays(40); // Method chaining
        System.out.println(date); // 2022-10-23

        date = date.minus(2, ChronoUnit.DAYS)
                .minus(4, ChronoUnit.WEEKS)
                .minus(11, ChronoUnit.MONTHS); // Method chaining
        System.out.println(date);// 2021-10-23
        //....................................................................................
        LocalTime witchingHour = LocalTime.MIDNIGHT // 00:00
                .plusHours(14) // 14:00
                .plusMinutes(45) // 14:45
                .plusMinutes(30) // 15:15
                .minusHours(15) // 00:15
                .minusMinutes(15); // 00:00
        System.out.println(witchingHour);

        LocalTime busDep = LocalTime.of(12, 15); // 12:15
        System.out.println(busDep);
        Duration d1 = Duration.ofMinutes(30); // PT30M
        System.out.println(d1);

        LocalTime nextBusDep = busDep.plus(d1); // 12:45
        System.out.println(nextBusDep);

        LocalDate birthday = LocalDate.of(2020, 10, 23); // 2020-10-23
        Period p1 = Period.ofYears(1); // P1Y
        System.out.println(p1);

        LocalDate nextBirthday = birthday.plus(p1); // 2021-10-23
        System.out.println(nextBirthday);

        //...............................................
        LocalDate dateq = LocalDate.of(2021, 10, 23); // (1)
        System.out.println("Date: " + dateq); // 2021-10-23
        dateq = dateq.plusMonths(10); // (2)
        System.out.println("10 months after: " + dateq); // 2022-08-23
        dateq = dateq.plusWeeks(3); // (3)
        System.out.println("3 weeks after: " + dateq); // 2022-09-13
        dateq = dateq.plusDays(40); // (4)
        System.out.println("40 days after: " + dateq); // 2022-
        dateq = dateq.minus(2, ChronoUnit.DAYS); // (5)
        System.out.println("2 days before: " + dateq); // 2022-
        dateq = dateq.minus(4, ChronoUnit.WEEKS); // (6)
        System.out.println("4 weeks before: " + dateq); // 2022-
        dateq = dateq.minus(11, ChronoUnit.MONTHS); // (7)
        System.out.println("11 months before: " + dateq); // 2021
    }
}
