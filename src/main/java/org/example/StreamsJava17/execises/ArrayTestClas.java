package org.example.StreamsJava17.execises;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Terrance Nyamfukudza
 * 30/3/2024
 */
public class ArrayTestClas {
    public static void main(String[] args) {
        List[] lists = new List[2];
        lists[0] = List.of("A", "B");
        lists[1] = List.of("C", "D");
        System.out.println(lists[0]+" "+lists[1]);
        List<String> list1 = List.of("A", "B");
        List<String> list2 = List.copyOf(list1);
        list1.add("C"); //1
        list2.add("D"); //2
        System.out.println(list1+" "+list2);

        ArrayList<Integer> list = new ArrayList<>();

//        ArrayList<String> list3 = new ArrayList<>(list); //3>
    }
}
