package org.example.StreamsJava17;

import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * @author Terrance Nyamfukudza
 * 16/3/2024
 */
public class MapAndTailMapTest {
    public static void main(String[] args) {
        NavigableMap<String, String> mymap = new TreeMap<String, String>();
        mymap.put("a", "apple"); mymap.put("b", "boy"); mymap.put("c", "cat");
        mymap.put("aa", "apple1"); mymap.put("bb", "boy1"); mymap.put("cc", "cat1");

        System.out.println(mymap);

        mymap.pollLastEntry(); //LINE 1
        mymap.pollFirstEntry(); //LINE 2

        System.out.println(mymap);

        NavigableMap<String, String> tailmap = mymap.tailMap("bb", false); //LINE 3
        System.out.println(tailmap.pollFirstEntry()); //LINE 4

        System.out.println(mymap);

        System.out.println(mymap.size()); //LINE 5

    }
}
