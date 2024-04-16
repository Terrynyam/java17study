package org.example.StreamsJava17.execises.qsns;

import java.util.Arrays;

/**
 * @author Terrance Nyamfukudza
 * 14/4/2024
 */
public class StringSplitMethod {
    public static void main(String[] args) {
        String name = "Terrance";

        String a [] = name.split("e",3);//[T, rranc, ]
        System.out.println(a.length);
        System.out.println(Arrays.stream(a).toList());
        String b [] = name.split("Terrance");//[]
        System.out.println(b.length);
        System.out.println(Arrays.stream(b).toList());
    }
}
