package org.example.StreamsJava17.execises;

import java.util.Arrays;
import java.util.List;

/**
 * @author Terrance Nyamfukudza
 * 2/4/2024
 */
public class StreamTest2 {
    public static void main(String[] args) {
        List<String> vals = Arrays.asList("a", "b");
        String join = vals.parallelStream()
                .reduce("_",
                        (a, b)->a.concat(b)
                );
        System.out.println(join);
    }
}
