package org.example.StreamsJava17.execises;

import java.util.List;
import java.util.Spliterator;

/**
 * @author Terrance Nyamfukudza
 * 8/4/2024
 */
public class SpliteratorTest {
    public static void main(String[] args) {
        List<Integer> li = List.of(3, 7, 2, 1, 4, 6, 5, 8);
        Spliterator<Integer> sit1 = li.spliterator();
        System.out.println(sit1.estimateSize());
        Spliterator<Integer> sit2 = sit1.trySplit();
        System.out.println(sit1.estimateSize());
        sit1.forEachRemaining(System.out::print);
        System.out.println("");
        sit2.forEachRemaining(System.out::print);
    }
}
