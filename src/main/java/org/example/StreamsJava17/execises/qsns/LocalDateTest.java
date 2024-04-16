package org.example.StreamsJava17.execises.qsns;

import java.time.LocalDate;

/**
 * @author Terrance Nyamfukudza
 * 14/4/2024
 */
public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate a = LocalDate.parse("1993-04-05");
        System.out.println(a);
        System.out.println(a.minusYears(-5));
        LocalDate aa = LocalDate.parse("1993-04-05");
        LocalDate bb = LocalDate.parse("1993-04-05");
        LocalDate cc = LocalDate.of(1992,04,05);
        LocalDate cc2 = LocalDate.of(1992,04,05);
        System.out.println((aa==bb) +":"+
                (bb==cc)+":"+
                (cc==cc2));
    }
}
