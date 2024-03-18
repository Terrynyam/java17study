package org.example.StreamsJava17.execises;

import java.util.Arrays;

/**
 * @author Terrance Nyamfukudza
 * 18/3/2024
 */
public class CompareAndMismatch {
    public static void main(String[] args) {
        int[] ia1 = { 0, 1, 2, 6};
        int[] ia2 = { 0, 1,2,6};
        System.out.println(Arrays.compare(ia1, ia2)); // returns prefix //prints -1
        System.out.println(Arrays.mismatch(ia1, ia2));// returns index where there is a mismatch
    }
}
