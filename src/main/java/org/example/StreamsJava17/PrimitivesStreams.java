package org.example.StreamsJava17;

import java.util.stream.Stream;

/**
 * @author Terrance Nyamfukudza
 * 15/3/2024
 */
public class PrimitivesStreams {
    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        stream.forEach(System.out::println);
    }
}
