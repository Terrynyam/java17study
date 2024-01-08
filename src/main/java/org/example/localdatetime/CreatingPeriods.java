package org.example.localdatetime;

import java.time.LocalDate;
import java.time.Period;

/**
 * @author Terrance Nyamfukudza
 * 4/1/2024
 */
public class CreatingPeriods {
    public static void main(String... args){
        Period p = Period.of(2, 4, 8); // (1)
        System.out.println(p); // (2) P2Y4M8D (2 Years, 4 Months, 8 Days)

        Period p1 = Period.ofYears(10); // P10Y, period of 10 years
        Period p2 = Period.ofMonths(14); // P14M, period of 14 months
        Period p3 = Period.ofDays(40); // P40D, period of 40 days.
        Period p4 = Period.ofWeeks(2); // P14D, period of 14 days
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        Period p5 = Period.of(2, 1, 30) // P2Y1M30D
                .withYears(3) // P3Y1M30D,
                .withMonths(16) // P3Y16M30D
                .withDays(1); // P3Y16M1D
        System.out.println(p5);

        Period p6 = Period.of(2, 10, 30) // P2Y10M30D
                .plusDays(10) // P2Y10M40D
                .plusMonths(8) // P2Y18M40D
                .plusYears(1) // P3Y18M40D
                .normalized(); // P4Y6M40D
        System.out.println(p6);

        Period p10 = Period.of(1, 1, 1); // P1Y1M1D
        LocalDate date1 = LocalDate.of(2021, 3, 1); // 2021-03-01
        LocalDate date2 = date1.plus(p10); // 2022-04-02
        LocalDate date3 = date1.minus(p10); // 2020-01-31
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
    }
}
