package org.example.StreamsJava17.execises;

import java.util.List;
import java.util.Spliterator;

/**
 * @author Terrance Nyamfukudza
 * 22/3/2024
 */
public class StreamSplit {
    public static void main(String[] args) {
        var stream = List.of("bird-", "bunny-", "cat-", "dog-", "fish-", "lamb-",
                "mouse-");
        Spliterator<String> originalBagOfFood = stream.spliterator();
        //originalBagOfFood.forEachRemaining(System.out::println); // prints the whole list

        Spliterator<String> emmasBag = originalBagOfFood.trySplit();
        emmasBag.forEachRemaining(System.out::print);// bird-bunny-cat-
        Spliterator<String> jillsBag = originalBagOfFood.trySplit();
        jillsBag.tryAdvance(System.out::print); // dog-
        jillsBag.forEachRemaining(System.out::print); // fish-

        originalBagOfFood.forEachRemaining(System.out::print); // lamb-mouse
    }
}
