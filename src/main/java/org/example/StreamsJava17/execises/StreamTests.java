package org.example.StreamsJava17.execises;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Terrance Nyamfukudza
 * 3/4/2024
 */
public class StreamTests {
    public static void main(String[] args) {
        Collection<Integer> a = List.of(1,2,3,4,5);
        Stream<Integer> s = a.parallelStream();
        //s.forEach(System.out::println);//this returns any sequence

        s.forEachOrdered(System.out::println);// returns a sequence with order
    }
}
