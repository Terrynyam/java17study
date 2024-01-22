package org.example.collections.arraylists;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Terrance Nyamfukudza
 * 16/1/2024
 */
public class ModifyingArrayListClass {
    public static void main(String... args){

        List<String> list1 = new ArrayList<>(); // []
        list1.add(0, "First"); // [First]
        System.out.println(list1.size());
        list1.add(list1.size(), "Last"); // [First, Last
        System.out.println(list1);

        ///// intList.remove(int)
        List<Integer> intList = new ArrayList<>();
        intList.add(10); intList.add(20); intList.add(1);
        System.out.println(intList); // [10, 20, 1]
        System.out.println("Element to be removed: " + 1); // 1
        System.out.println("Element removed: " + intList.remove(1)); // 20
        System.out.println(intList); // [10, 1]
        System.out.println("Element removed: " + intList.remove(Integer.valueOf(1))); // true
        System.out.println(intList);//[10]
        //

        List<Integer> newList = intList.subList(0,1);//[10]
        System.out.println(newList);//[10]
        newList.remove(0);
        System.out.println(newList);//[]
        System.out.println(intList);//[]

        String[] data1 = {"A","B","B","A"};
    }
}
