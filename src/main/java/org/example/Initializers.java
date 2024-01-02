package org.example;

/**
 * @author Terrance Nyamfukudza
 * 26/12/2023
 */
public class Initializers {
    int noOfDays = 7 * NO_OF_WEEKS; // (1) Non-static
    static int NO_OF_WEEKS = 52;
    public static void main(String... args){

        Initializers a = new Initializers();
        System.out.println(a.noOfDays);
    }
}
