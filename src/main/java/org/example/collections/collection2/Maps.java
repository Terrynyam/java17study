package org.example.collections.collection2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Terrance Nyamfukudza
 * 30/1/2024
 */
public class Maps {
    public static void main(String... args){
        StringBuilder mc1 = new StringBuilder("Basic Java");
        StringBuilder mc2 = new StringBuilder("Intermediate Java");
        StringBuilder mc3 = new StringBuilder("Advanced Java");
        StringBuilder mc4 = new StringBuilder("Kickass Java");

        // Original map:
        Map<Integer, StringBuilder> courseMap = new HashMap<>();
        courseMap.put(200, mc1); courseMap.put(300, mc2);
        courseMap.put(400, mc3); courseMap.put(500, mc4);

        // Unmodifiable copy of the map:
        // map.copyOf() method creates a copy of an unmodifiable Map
        Map<Integer ,StringBuilder> copyCourseMap = Map.copyOf(courseMap);
        // (1)Map<Integer, StringBuilder> copyCourseMap = Map.copyOf(courseMap); // (1)
        // Modify original map:
        courseMap.remove(200);
        courseMap.remove(400);
        System.out.println("Original: " + courseMap);
        System.out.println("Copy: " + copyCourseMap);
    }
}
