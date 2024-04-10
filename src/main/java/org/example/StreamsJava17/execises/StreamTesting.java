package org.example.StreamsJava17.execises;

import java.util.stream.Stream;

/**
 * @author Terrance Nyamfukudza
 * 8/4/2024
 */
public class StreamTesting {
    public static void main(String[] args) {
        Stream<Integer> stream =
                Stream.of(1, 2, 3, 4, 5).map(i -> i * i);
        stream.forEach(System.out::println);// <1>
        //----------------------------------
        //.map , .mapToInt , .mapToLong can be used to transform Stream
        Stream.of("Pass","the","test").
                map(String::length).
                forEach(System.out::println);
    }
}
