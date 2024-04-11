package org.example.StreamsJava17.execises;

/**
 * @author Terrance Nyamfukudza
 * 10/4/2024
 */
public class TryAndCatchTestClass {
    public static void main(String[] args) {
//        try {
//            System.out.println(10 / 0);
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//        }

        divideByZero2();

    }
    static void divideByZero() throws Exception {
        throw new Exception();
    }
    static void divideByZero2() {
        try {
            divideByZero();
            //System.out.println("ola");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //throw new RuntimeException();
        }
        finally {
            System.out.println("finally block");
        }
        System.out.println("outside try catch block");
    }
}
