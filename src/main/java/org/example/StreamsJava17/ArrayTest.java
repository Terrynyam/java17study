package org.example.StreamsJava17;

/**
 * @author Terrance Nyamfukudza
 * 16/3/2024
 */
public class ArrayTest {
    public static void main(String[] args) {
       //var ia[][] = { {1, 2}, null }; will not compile
        // because var ia[][] is invalid because var is not allowed as an element type of an array
        //replacing with
        var ia = new int[][]{ {1, 2}, null };

       for (int i = 0; i < 2; i++)
           for (int j = 0; j < 2; j++)
               System.out.println(ia[i][j]);

    }
}
