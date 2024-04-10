package org.example.StreamsJava17.execises;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author Terrance Nyamfukudza
 * 8/4/2024
 */
public class FunctionIdentity {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange");
        List<String> capitalizedWords = words.stream()
                .map(Function.identity())
                .map(String::toUpperCase)
                .toList();

        System.out.println(capitalizedWords); // Output: [APPLE, BANANA, ORANGE]
        //--------------------------------
        List<String> wordss = Arrays.asList("apple", "banana", "orange");
        List<String> capitalizedWordss = wordss.stream()
                .map(a-> a)
                .map(String::toLowerCase)
                .toList();

        System.out.println(capitalizedWordss); // Output: [APPLE, BANANA, ORANGE]
    }
}
