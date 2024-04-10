package org.example;

/**
 * @author Terrance Nyamfukudza
 * 3/4/2024
 */
public class MathsTest {
    int a = 5*b;
    static int b = 5;
    public static void main(String[] args) {
        double a = Math.ceil(25.5);
        double b = Math.floor(25.5);
        long c = Math.round(5.5);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
