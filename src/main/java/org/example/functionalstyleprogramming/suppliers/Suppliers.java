package org.example.functionalstyleprogramming.suppliers;

import java.util.Random;
import java.util.function.Supplier;

/**
 * @author Terrance Nyamfukudza
 * 5/2/2024
 */
public class Suppliers {
    public static void main(String... args){
        Supplier<StringBuilder> createSB = () -> new StringBuilder("Howdy!"); // (1)
        System.out.println(createSB.get()); // Prints: Howdy!

        String str = "uppercase me!";
        Supplier<String> makeUppercase = () -> str.toUpperCase(); // (2)
        System.out.println(makeUppercase.get()); // Prints: UPPERCASE ME!

        Random numGen = new Random();
        Supplier<Integer> intSupplier = () -> numGen.nextInt(100); // numGen effect. final
        System.out.println(intSupplier.get()); // Prints a number in between [0, 100).
    }
}
