package org.example;

/**
 * @author Terrance Nyamfukudza
 * 18/12/2023
 */
public class TryCatchAndFinally {
    public static void main(String[] args){
        int a = 5,b=6;
        try {
            System.out.println(a/2);
        }
        catch (ArithmeticException e){
            System.out.println("not divisible by 0");
        }
        // the final block will always execute even an exception is caught
        finally {
            System.out.println("ola");
        }

        try{
            System.out.println("levels");
        }
        finally {
            System.out.println("hello");
        }

    }
}
