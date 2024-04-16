package org.example.StreamsJava17.execises.qsns;

import java.util.Arrays;

/**
 * @author Terrance Nyamfukudza
 * 14/4/2024
 */
public class ArrayTesting {
    public static void main(String[] args) {
        short ma = 5;
        int mb = 5;
        System.out.println(ma==mb);//true

        int [][] v = new int[2][2];
        System.out.println(v[0][0]);//0
        Boolean [] a = new Boolean[2];
        boolean [] b = new boolean[2];
        System.out.println(Arrays.stream(a).toList());//null,null
        System.out.println(b[0]);//false false

    }
}
