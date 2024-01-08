package org.example.localdatetime;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * @author Terrance Nyamfukudza
 * 4/1/2024
 */
public class ValidTemporalUnitsAndFields {
    public static void main(String[] args) {
// Temporals:
        LocalTime time = LocalTime.now();
        LocalDate date = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        Instant instant = Instant.now();
// Print supported units:
        System.out.printf("%29s %s %s %s %s %s%n",
                "ChronoUnit", "LocalTime", "LocalDate", "LocalDateTime",
                " ZDT ", "Instant");
        ChronoUnit[] units = ChronoUnit.values();
        for (ChronoUnit unit : units) {
            System.out.printf("%28S: %7b %9b %10b %9b %7b%n",
                    unit.name(), time.isSupported(unit), date.isSupported(unit),
                            dateTime.isSupported(unit), zonedDateTime.isSupported(unit),
                                    instant.isSupported(unit));
        }
        System.out.println();
// Print supported fields:
        System.out.printf("%29s %s %s %s %s %s%n",
                "ChronoField", "LocalTime", "LocalDate", "LocalDateTime",
                " ZDT ", "Instant");
        ChronoField[] fields = ChronoField.values();
        for (ChronoField field : fields) {
            System.out.printf("%28S: %7b %9b %10b %9b %7b%n",
                    field.name(), time.isSupported(field), date.isSupported(field),
                            dateTime.isSupported(field), zonedDateTime.isSupported(field),
                                    instant.isSupported(field));
        }
        System.out.println();
    }
}
