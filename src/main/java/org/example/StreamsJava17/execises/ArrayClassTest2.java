package org.example.StreamsJava17.execises;

import java.util.Arrays;
import java.util.List;

/**
 * @author Terrance Nyamfukudza
 * 24/3/2024
 */
public class ArrayClassTest2 {
    public static void main(String[] args) {
        List<Integer> names = Arrays.asList(1, 2, 3); //1
        names.forEach(x->x=x+1); //2
        names.forEach(System.out::println); //3
    }
}
