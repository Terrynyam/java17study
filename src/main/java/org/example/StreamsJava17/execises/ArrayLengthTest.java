package org.example.StreamsJava17.execises;

/**
 * @author Terrance Nyamfukudza
 * 24/3/2024
 */
public class ArrayLengthTest {
    public static void main(String[] args) {
        var i = 4;
        int ia[][][] = new int[i][i = 3][i];
        System.out.println( ia.length + ", " + ia[0].length+", "+ ia[0][0].length);

        // {
        // {{1,2,3},{1,2,3},{1,2,3}},------0
        // {{1,2,3},{1,2,3},{1,2,3}},------1
        // {{1,2,3},{1,2,3},{1,2,3}},------2
        // {{1,2,3},{1,2,3},{1,2,3}}-------3
        // }

        //-----------------------------------------------
        int a [][] = {{1,2,3,4},{1,2}};
        System.out.println(a.length);
    }
}
