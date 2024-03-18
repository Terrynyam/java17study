package org.example.StreamsJava17.execises;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author Terrance Nyamfukudza
 * 18/3/2024
 */
public class SortTest {
    public static void main(String[] args) {
        Object[] sa = { 100, 100.0, "100" };
        Collections.sort(Arrays.asList(sa), null);
        System.out.println(sa[0]+" "+sa[1]+" "+sa[2] );
    }
}
