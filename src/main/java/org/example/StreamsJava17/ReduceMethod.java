package org.example.StreamsJava17;

import java.util.stream.Stream;

/**
 * @author Terrance Nyamfukudza
 * 15/3/2024
 */
public class ReduceMethod {
    public static void main(String[] args) {
        var array = new String[] { "w", "o", "l", "f" };
        var result = "";
        for (var s: array) result = result + s;
        System.out.println(result); // wolf

        //--------------------------------------
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        String word = stream.reduce("", (s, c) -> s + c);
        System.out.println(word); // wolf
        //-------------------------------
        Stream<String> streams = Stream.of("w", "o", "l", "f");
        String words = streams.reduce("", String::concat);
        System.out.println(word); // wolf

        //----------------------------------
        Stream<Integer> stream1 = Stream.of(3, 5, 6);
        System.out.println(stream1.reduce(1, (a, b) -> a*b));

        //------------------------------------------

        Stream<String> stream2 = Stream.of("w", "o", "l", "f!");
        int length = stream2.reduce(0, (i, s) -> i+s.length(), (a, b) -> a+b);
        System.out.println(length); // 5
    }
}
