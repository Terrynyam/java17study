package org.example.StreamsJava17.execises;

/**
 * @author Terrance Nyamfukudza
 * 10/4/2024
 */
public class AX {
        static int[] x = new int[0];
        static{
            x[0] = 10;//Exception in thread "main" java.lang.ExceptionInInitializerError
            //Caused by: java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
            //at org.example.StreamsJava17.execises.AX.<clinit>(AX.java:10)

        }
        public static void main(String[] args){
            var ax = new AX();
        }

}
