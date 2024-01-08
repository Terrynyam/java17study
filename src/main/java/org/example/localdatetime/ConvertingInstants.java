package org.example.localdatetime;

import java.time.*;

/**
 * @author Terrance Nyamfukudza
 * 4/1/2024
 */
public class ConvertingInstants {
    public static void main(String... args){
        /*
        * the offset for the time zone "America/New_York" is -4 hours from UTC.
        * */
        Instant instant = Instant.parse("2021-04-28T03:15:00Z");
        ZoneId zid = ZoneId.of("America/New_York");
        LocalTime lt = LocalTime.ofInstant(instant, zid); // 23:15
        LocalDate ld = LocalDate.ofInstant(instant, zid); // 2021-04-27
        LocalDateTime ldt = LocalDateTime.ofInstant(instant, zid); // 2021-04-27T23:15
        ZonedDateTime zdt = ZonedDateTime.ofInstant(instant, zid); // 2021-04-27T23:15-04:00[America/New_York]
        // 2021-04-27T23:15-04:00[America/New_York]
        System.out.println(lt);
        System.out.println(ld);
        System.out.println(ldt);
        System.out.println(zdt);
    }
}
