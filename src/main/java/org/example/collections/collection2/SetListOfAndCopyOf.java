package org.example.collections.collection2;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Terrance Nyamfukudza
 * 28/1/2024
 */
public class SetListOfAndCopyOf {
    public static void main (String... args){
        Set<String> fab4 = new HashSet<>();
        fab4.add("John"); fab4.add("Paul"); fab4.add("George"); fab4.add("Ringo");
        System.out.println(fab4); // [George, John, Ringo, Paul]

        Set<String> fabAlways = Set.copyOf(fab4); // (1)

        fab4.remove("John"); fab4.remove("George"); // Modify original set
        //change in the main set does not affect the copied set

        System.out.println(fab4); // [Ringo, Paul]
        System.out.println(fabAlways); // [John, Paul, Ringo, George]
    }
}
