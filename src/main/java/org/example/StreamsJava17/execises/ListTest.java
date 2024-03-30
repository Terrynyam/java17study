package org.example.StreamsJava17.execises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Terrance Nyamfukudza
 * 20/3/2024
 */
public class ListTest {
    public static void main(String[] args) {
        List s1 = new ArrayList( );
        s1.add("a");
        s1.add("b");
        s1.add(1, "c");// add at index 1
        System.out.println(s1);
        List s2 = new ArrayList(  s1.subList(1, 1) );
        System.out.println(s2);
        s1.addAll(s2);
        System.out.println(s1);

        List  a1 = new ArrayList( );
        a1.add("a");
        a1.add("b");
        a1.add("a");
        System.out.println(a1);
        a1.remove("a");
        System.out.println(a1);
        a1.remove("a");
        System.out.println(a1);

        //--------------------------------------------
        var numA = new Integer[]{1, null, 3}; //1
        var list1 = List.of(numA); //2
        var list2 = Collections.unmodifiableList(list1); //3
        numA[1] = 2; //4
        System.out.println(list1+" "+list2);
    }
}
