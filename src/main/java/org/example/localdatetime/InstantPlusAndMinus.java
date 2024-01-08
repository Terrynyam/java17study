package org.example.localdatetime;

import java.time.Instant;

/**
 * @author Terrance Nyamfukudza
 * 4/1/2024
 */
public class InstantPlusAndMinus {
    public static void main(String... args){
        Instant event =
                Instant.EPOCH // 1970-01-01T00:00
                        .plusSeconds(7L*24*60*60) // (+7days) 1970-01-08T00:00
                        .plusSeconds(6L*60*60) // (+6hrs) 1970-01-08T06:00
                        .plusSeconds(5L*60) // (+5mins) 1970-01-08T06:05
                        .plusSeconds(4L) // (+4s) 1970-01-08T06:05
                        .plusMillis(3L*100) // (+3ms) 1970-01-08T06:05
                        .plusNanos(2L*1_000) // (+2micros) 1970-01-08T06:05
                        .plusNanos(1L); // (+1ns) 1970-01-08T06:05

        System.out.println(event);
    }
}
