package org.example.StreamsJava17.execises;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

/**
 * @author Terrance Nyamfukudza
 * 18/3/2024
 */
public class SortTest {
    public static void main(String[] args) {
        Object[] sa = { 100, 100.0, "100" };
        Collections.sort(Arrays.asList(sa), null);
        System.out.println(sa[0]+" "+sa[1]+" "+sa[2] );

        TreeSet<Integer> s = new TreeSet<Integer>();
        TreeSet<Integer> subs = new TreeSet<Integer>();
    }
}
