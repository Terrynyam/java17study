package org.example.StreamsJava17.execises;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author Terrance Nyamfukudza
 * 7/4/2024
 */
public class DateAndTimeClassTest {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2022, 12,
                02, 6,
                0, 0);
        ZonedDateTime nyZdt = ZonedDateTime.of(ldt, ZoneId.of("US/Eastern"));
        System.out.println(nyZdt);
//        ZonedDateTime nyZdt = ldt.atZone(nyZone);
//        ZonedDateTime laZdt = ldt.atZone(laZone);
        ZonedDateTime laZdt = ZonedDateTime.of(ldt, ZoneId.of("Africa/Harare"));
        System.out.println(laZdt);
        Duration d = Duration.between(nyZdt, laZdt); System.out.println(d);
    }
}
