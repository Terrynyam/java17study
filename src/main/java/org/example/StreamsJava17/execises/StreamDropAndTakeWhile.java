package org.example.StreamsJava17.execises;

import java.util.stream.IntStream;

/**
 * @author Terrance Nyamfukudza
 * 31/3/2024
 */
public class StreamDropAndTakeWhile {
    public static void main(String[] args) {
        IntStream is = IntStream.range(2, 6);
        IntStream is2 = is.takeWhile(x-> x%2==0);
        is2.forEach(System.out::println);
        //---------------------------------------------------

        IntStream a = IntStream.range(1, 6);
        IntStream b = a.dropWhile(x-> x%2==0);
        b.forEach(System.out::print);
    }
}
