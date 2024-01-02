package org.example;

/**
 * @author Terrance Nyamfukudza
 * 21/11/2023
 */
public class MethodCall {
    static void print(Object... obj) {
        System.out.println("Object...: " + obj[0]);
    }
    public static void main(String[] args) {

        print("9", "1", "1");
        print(9, 1, 1);
        print(new int[] {9, 1, 1});
        print(new Integer[] {9, 1, 1});
    }
}
