package org.example.collections.collection2;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * @author Terrance Nyamfukudza
 * 28/1/2024
 */
public class NavigableSets {
    public static void main(String... args){
        //The following code shows how we can create a sorted set with a specific total ordering, by
        //supplying a comparator in the constructor call:

        NavigableSet<String> strSetB = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        Collections.addAll(strSetB, "strictly", "dancing", "Java", "Ballroom");
        System.out.println(strSetB); // [Ballroom, dancing, Java, strictly]
        strSetB.pollFirst();// removes Ballroom
        System.out.println(strSetB);//[dancing, Java, strictly]
        strSetB.pollLast();// removes strictly
        System.out.println(strSetB);//[dancing, Java]
    }
}
