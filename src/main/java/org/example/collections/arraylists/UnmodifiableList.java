package org.example.collections.arraylists;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Terrance Nyamfukudza
 * 16/1/2024
 */
public class UnmodifiableList {
    public static void main(String... args){
        //Unmodifiable List by using the List.of() method
        List<String> list = List.of("Tom", "Dick", "Harriet");

        // list.add("Harry"); // UnsupportedOperationExcep
        // list.remove(2); // UnsupportedOperationExcep
        // list.set(0, "Tommy"); // UnsupportedOperationExcep

        System.out.println(list);// [Tom, Dick, Harriet]

        List<String> fab4 = new ArrayList<>();
        fab4.add("John");
        fab4.add("Paul");
        fab4.add("George");
        fab4.add("Ringo");
        System.out.println(fab4); // [John, Paul, George, Ringo]

        //Creating an unmodifiable list using List.copyOf() method
        List<String> fabAlways = List.copyOf(fab4); // (1)
        //fabAlways.remove("John");  this will cause an error because it is unmodified
        System.out.println(fabAlways);
        fab4.remove("John"); fab4.remove("George"); // Modify original list
        System.out.println(fab4); // [Paul, Ringo]
        System.out.println(fabAlways); // [John, Paul, George, Ringo]
        fab4.removeAll(fab4);
        System.out.println(fab4);//[]
    }
}
