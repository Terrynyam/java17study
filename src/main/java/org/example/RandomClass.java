package org.example;

import java.util.Random;

/**
 * @author Terrance Nyamfukudza
 * 21/12/2023
 */
public class RandomClass {
    public static void main(String... args){
        Random generator = new Random();
        int a = generator.nextInt(11);
        System.out.println(a);
    }
}
