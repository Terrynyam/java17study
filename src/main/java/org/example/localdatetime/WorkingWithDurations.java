package org.example.localdatetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * @author Terrance Nyamfukudza
 * 4/1/2024
 */
public class WorkingWithDurations {
    public static void main(String... args){
        Duration d11 = Duration.of(1L, ChronoUnit.DAYS); // P2
        Duration d22 = Duration.of(24L, ChronoUnit.HOURS); // P2
        Duration d33 = Duration.of(24L*60, ChronoUnit.MINUTES); // P2
        Duration d44 = Duration.of(24L*60*60, ChronoUnit.SECONDS); // P2
        Duration d88 = Duration.of(24L*60*60*1000, ChronoUnit.MILLIS);// P2
        Duration d77 = Duration.of(24L*60*60*1_000_000_000,
                ChronoUnit.NANOS); //
        System.out.println(d11+" "+d22);//PT24H PT24H
        System.out.println(d33+" "+d44);//PT24H PT24H
        System.out.println(d88+" "+d77);//PT24H PT24H

        Duration duration = Duration.ofDays(7).ofHours(24);
        System.out.println(duration);//PT24H [The of() method creates a new Duration object based on its argument]

        LocalTime startTime = LocalTime.of(14, 30); // 14
        LocalTime endTime = LocalTime.of(17, 45, 15); // 17
        Duration interval1 = Duration.between(startTime, endTime); // PT3
        Duration interval2 = Duration.between(endTime, startTime);
        System.out.println(interval1);// PT3H15M15S
        System.out.println(interval2);// PT-3H-15M-15S

        Duration dx = Duration.ofSeconds(12L*60*60, 500_000_000L); // PT12H0.5S
        System.out.println(dx);
        System.out.println(dx.getNano()); // 500000000
        System.out.println(dx.getSeconds()); // 43200
        System.out.println(dx.get(ChronoUnit.NANOS)); // 500000000
        System.out.println(dx.get(ChronoUnit.SECONDS)); // 43200
        //System.out.println(dx.get(ChronoUnit.MINUTES)); // UnsupportedTemporalTypeException
        System.out.println(dx.getUnits()); // [Seconds, Nanos]
        System.out.println("Days: " + dx.toDays()); // Days: 0
        System.out.println("Hours: " + dx.toHours()); // Hours: 12
        System.out.println("Minutes: " + dx.toMinutes()); // Minutes: 720
        System.out.println("Millis: " + dx.toMillis()); // Millis: 43200500
        System.out.println("Nanos: " + dx.toNanos()); // Nanos: 43200500000000
    }
}
