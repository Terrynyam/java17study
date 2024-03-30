package org.example.StreamsJava17.execises;

import java.util.ArrayList;

/**
 * @author Terrance Nyamfukudza
 * 27/3/2024
 */
public class TestArrays {
    public static void main(String[] args) {
        var list = new ArrayList<>(); list.add(20); list.add("20");
        var size = 10;
        var arr = new int[size];
        for (var i = 0 ; i < size ; ++i) System.out.println(arr[i]);
    }
}
