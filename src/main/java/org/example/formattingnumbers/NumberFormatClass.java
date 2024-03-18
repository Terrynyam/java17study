package org.example.formattingnumbers;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.stream.Stream;

/**
 * @author Terrance Nyamfukudza
 * 17/3/2024
 */
public class NumberFormatClass {
    public static void main(String[] args) {
        var formatters = Stream.of(
                NumberFormat.getCompactNumberInstance(),
                NumberFormat.getCompactNumberInstance(Locale.getDefault(), NumberFormat.Style.SHORT),
                NumberFormat.getCompactNumberInstance(Locale.getDefault(), NumberFormat.Style.LONG),
                NumberFormat.getCompactNumberInstance(Locale.GERMAN, NumberFormat.Style.SHORT),
                NumberFormat.getCompactNumberInstance(Locale.GERMAN, NumberFormat.Style.LONG),
                NumberFormat.getNumberInstance());

        formatters.map(s -> s.format(7_123_456)).forEach(System.out::println);
    }
}
