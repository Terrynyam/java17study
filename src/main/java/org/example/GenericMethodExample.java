package org.example;

/**
 * @author Terrance Nyamfukudza
 * 2/1/2024
 */
public class GenericMethodExample {
    // Generic method
    public static <T> T displayAndReturn(T value) {
        System.out.println("Value: " + value);
        return value;
    }

    public static void main(String[] args) {
        // Type inference - the compiler infers the type based on the argument
        String result1 = displayAndReturn("Hello, World!");
        Integer result2 = displayAndReturn(42);

        // The type parameters are inferred, so you don't need to specify them explicitly
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}
