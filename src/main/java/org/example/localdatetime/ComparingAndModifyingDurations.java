package org.example.localdatetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Terrance Nyamfukudza
 * 5/1/2024
 */
public class ComparingAndModifyingDurations {
    public static void main(String... args){
        Duration eatBreakFast = Duration.ofMinutes(20L); // PT20M
        Duration eatLunch = Duration.ofSeconds(30L*60); // PT30M
        Duration eatSupper = Duration.of(45L, ChronoUnit.MINUTES); // PT45M
        System.out.println(eatBreakFast.equals(eatLunch)); // false
        System.out.println(Duration.ofSeconds(0).equals(Duration.ZERO)); // true
        List<Duration> ld = Arrays.asList(eatSupper, eatBreakFast, eatLunch);
        Collections.sort(ld); // Natural order.
        System.out.println(ld); // [PT20M, PT30M,PT45M]

        Duration oneDuration = Duration.ZERO // PT0S
                .withNanos(500_000_000) // New co
                .withSeconds(12L*60*60);
        System.out.println(oneDuration);

        Duration max20H = Duration.ZERO // PT0S
                .plusHours(10) // PT10H
                .plusMinutes(10*60 + 30) // PT20H30M
                .plusSeconds(6*60*60 + 15) // PT26H30M15S
                .minusMinutes(2*60 + 30) // PT24H15S
                .minusSeconds(15);// PT24H
        System.out.println(max20H);


        Duration duration = Duration.ofHours(2).plusMinutes(15); //
        LocalTime firstShowTime = LocalTime.of(10, 10); //
        LocalTime endTimeExclusive = LocalTime.of(23, 0); //
        for (LocalTime time = firstShowTime; //
             time.plus(duration).isBefore(endTimeExclusive);
             time = time.plus(duration)) {
            System.out.println("Showtime (" + duration + "): " + time);
        }
        System.out.println("Closing time: " + endTimeExclusive);
    }
}
