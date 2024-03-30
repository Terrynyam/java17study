package org.example.StreamsJava17.execises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author Terrance Nyamfukudza
 * 29/3/2024
 */
public class ReduceClassTest {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(-2, 0, 4, 6, 8);

        // Finding sum of all elements
        int sum = array.stream().reduce(2,
                (element1, element2) -> element1 + element2);

        // Displaying sum of all elements
        System.out.println("The sum of all elements is " + sum);

        //-----------------------------------------------------------------

        // To get the product of all elements
        // in given range excluding the
        // rightmost element
        int product = IntStream.range(2, 8)
                .reduce((num1, num2) -> num1 * num2)
                .orElse(-1);

        // Displaying the product
        System.out.println("The product is : " + product);
    }
}
