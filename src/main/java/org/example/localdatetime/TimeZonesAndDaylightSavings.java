package org.example.localdatetime;

import java.time.*;
import java.time.temporal.ChronoField;

/**
 * @author Terrance Nyamfukudza
 * 5/1/2024
 */
public class TimeZonesAndDaylightSavings {
    public static void main(String... args){
        ZoneId.getAvailableZoneIds() // Prints a long list of available zone ids
                .stream()
                .sorted()
                .forEachOrdered(System.out::println); //

        System.out.println(ZoneId.systemDefault());// returns system default zone id thus Africa/Harare

        //Creating Zoned Date-Time

        ZonedDateTime defaultZDT = ZonedDateTime.now();
        ZonedDateTime utcZDT = ZonedDateTime.now(ZoneId.of("UTC"));
        ZonedDateTime edtZDT = ZonedDateTime.now(ZoneId.of("US/Eastern"));
        System.out.println("Default Zone Date-time: " + defaultZDT);// 2024-01-05T12:54:40.693182800+02:00[Africa/Harare]
        System.out.println("UTC Date-time: " + utcZDT);// 2024-01-05T10:54:40.693182800Z[UTC]
        System.out.println("EDT Zone Date-time: " + edtZDT);// 2024-01-05T05:54:40.694182900-05:00[US/Eastern]

        LocalTime concertTime = LocalTime.of(00, 10); // 00:10
        LocalDate concertDate = LocalDate.of(1973, Month.JANUARY, 14); // 1973-01-14
        LocalDateTime concertDT = LocalDateTime.of(concertDate,
                concertTime); // 1973-01-14T00:10
        ZoneId hwZID = ZoneId.of("US/Hawaii"); // US/Hawawaii
        Instant instantZ = Instant.ofEpochSecond(95854200); // 1973-01-14T10:10:00Z
        System.out.println(concertDT);
        System.out.println(hwZID);
        System.out.println(instantZ);

        ZonedDateTime concertZDT3 = concertDT.atZone(hwZID);
        ZonedDateTime concertZDT4 = instantZ.atZone(hwZID);
        // 1973-01-14T00:10-10:00[US/Hawaii]
        System.out.println(concertZDT3);
        System.out.println(concertZDT4);

        LocalTime theTime = concertZDT4.toLocalTime();
        LocalDate theDate = concertZDT4.toLocalDate();
        LocalDateTime theDT = concertZDT4.toLocalDateTime();
        ZoneId theZID = concertZDT4.getZone();
        ZoneOffset theZoffset = concertZDT4.getOffset();
        System.out.println(theTime +" "+theDate);//00:10 1973-01-14
        System.out.println(theDT+" "+theZID);//1973-01-14T00:10 US/Hawaii
        System.out.println(theZoffset);//-10:00

        ZonedDateTime theZDT = concertZDT4 // 1973-01-14T00:10-10:0
                .withYear(1977) // 1977-01-14T00:10-10:0
                .with(ChronoField.MONTH_OF_YEAR, 8) // 1977-08-14T00:10-10:0
                .withDayOfMonth(16) // 1977-08-16T00:10-10:0
                .with(ChronoField.HOUR_OF_DAY, 9) // 1977-08-16T09:10-10:0
                .with(ChronoField.MINUTE_OF_HOUR, 30); // 1977-08-16T09:30-10:
        System.out.println(theZDT);
    }
}
