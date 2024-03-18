package org.example.StreamsJava17;

import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Terrance Nyamfukudza
 * 15/3/2024
 */
public class CollectMethod {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        StringBuilder word = stream.collect(
                StringBuilder::new,
                StringBuilder::append,
                StringBuilder::append);
        System.out.println(word);

        //------------------------------

        Stream<String> stream1 = Stream.of("w", "o", "l", "f");
        TreeSet<String> set =
                stream1.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set); // [f, l, o, w]
    }
}
