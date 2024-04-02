package org.example.StreamsJava17.execises;

import java.util.List;

/**
 * @author Terrance Nyamfukudza
 * 30/3/2024
 */
public class ArrayTestClas {
    public static void main(String[] args) {
        List<String> list1 = List.of("A", "B");
        List<String> list2 = List.copyOf(list1);
        list1.add("C"); //1
        list2.add("D"); //2
        System.out.println(list1+" "+list2);
    }
}
