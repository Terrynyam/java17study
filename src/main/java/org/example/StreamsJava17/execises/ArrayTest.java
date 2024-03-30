package org.example.StreamsJava17.execises;

/**
 * @author Terrance Nyamfukudza
 * 22/3/2024
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] A = { 1,2,3,4,5};
        System.out.println(A);
        int [] B = A.clone();// new array object created
        System.out.println(B);
        System.out.println(A==B);// false

        System.out.println(A[0]==B[0]); // true still points to A objects
        A[0] = 6;
        for(int a : A){
            System.out.print(a);
        }
        for(int a : B){
            System.out.print(a);
        }
        System.out.println(A==B);
    }
}
