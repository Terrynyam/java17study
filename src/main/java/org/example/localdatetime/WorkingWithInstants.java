package org.example.localdatetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * @author Terrance Nyamfukudza
 * 4/1/2024
 */
public class WorkingWithInstants {
    public static void main(String[] args) {
        // epoch (1970-01-01T00:00:00Z)

        Instant currentInstant = Instant.now();
        System.out.println(currentInstant);//2024-01-04T13:17:17.639313300Z

        Instant inst1 = Instant.ofEpochMilli(-24L*60*60*1000);// Date 1 day before Epoch
        Instant inst2 = Instant.ofEpochSecond(24L*60*60); // Date 1 day after Epoch
        Instant inst3 = Instant.ofEpochSecond(24L*60*60 - 1, // Date 1 day after Epoch
                1_000_000_000L);
        System.out.println("A day before: " + inst1); // Date 1 day before: 1969-12-31T00:00:00Z
        System.out.println("A day after: " + inst2); // Date 1 day after : 1970-01-02T00:00:00Z
        System.out.println("A day after: " + inst3); // Date 1 day after : 1970-01-02T00:00:00Z

        Instant inst4 = Instant.ofEpochSecond(0, 500);
        System.out.println("Default format: " + inst4);// 1970-01-01T00:00:00.000000500Z
        //.......................................................
        LocalDateTime ldt = LocalDate.of(2021, 12, 25).atStartOfDay(); //2021-12-25T00:00
        Instant i1 = ldt.toInstant(ZoneOffset.of("+02:00")); // (2) Ahead of UTC
        Instant i2 = ldt.toInstant(ZoneOffset.UTC); // (3) At UTC
        Instant i3 = ldt.toInstant(ZoneOffset.of("-02:00")); // (4) Behind UTC
        System.out.println("ldt: " + ldt);// 2021-12-25T00:00
        System.out.println("i1: " + i1);// 2021-12-24T22:00:00Z
        System.out.println("i2: " + i2);// 2021-12-25T00:00:00Z
        System.out.println("i3: " + i3);// 2021-12-25T00:00:00Z
    }
}
