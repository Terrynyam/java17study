package org.example.collections.collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Terrance Nyamfukudza
 * 3/2/2024
 */
public class Sorting {
    public static void main(String... args){
        List<String> strList = new ArrayList<>();
        Collections.addAll(strList, "biggest", "big", "bigger", "Bigfoot");
        System.out.println(strList);//[biggest, big, bigger, Bigfoot]

        strList.sort(null); // Natural order
        System.out.println(strList);//[Bigfoot, big, bigger, biggest]

        strList.sort(Comparator.comparing(String::length)); // length order ... sort by length of word
        System.out.println(strList);
        strList.sort(Collections.reverseOrder()); // Reverse natural order\
        System.out.println(strList);
        Collections.sort(strList, String.CASE_INSENSITIVE_ORDER);// Case insensitive order
        System.out.println(strList);
        Collections.sort(strList, // Reverse case insensitive order
                Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
        System.out.println(strList);
    }
}
