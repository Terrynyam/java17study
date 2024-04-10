package org.example.StreamsJava17.execises;

import java.time.*;

/**
 * @author Terrance Nyamfukudza
 * 5/4/2024
 */
public class OffsetClass {
    public static void main(String[] args) {
        LocalDateTime ld = LocalDateTime.of(2022, Month.NOVEMBER, 6, 1, 30);
        ZonedDateTime date1 = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
        ZonedDateTime date2 = date1.plusHours(1);
        System.out.println( Duration.ofSeconds( date1.getOffset().compareTo(date2.getOffset()))                             .toHours() );
    }
}
