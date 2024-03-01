package org.example.functionalstyleprogramming.functions;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToIntBiFunction;

/**
 * @author Terrance Nyamfukudza
 * 11/2/2024
 */
public class BiFunctions {
    public static void main(String... args){
        BiFunction<Double, Double, Double> areaOfRectangle
                = (length, width) -> length * width; // (Double, Double) -> Double

        System.out.printf("%.2f x %.2f = %.2f%n",
                25.0, 4.0, areaOfRectangle.apply(25.0, 4.0));
// 25.00 x 4.00 = 100.00

        BiFunction<String, String, String> concatStr = (s1, s2) -> s1 + s2;
        Function<String, String> postfix1 = s -> s + "nana";

        Function<String, String> postfix2 = s -> s + "s!";
        System.out.println(concatStr.andThen(postfix1).andThen(postfix2)
                .apply("I am going", " ba")); // I am going bananas!

        ToIntBiFunction<String, String> addIntStrs
                = (s1, s2) -> Integer.parseInt(s1) + Integer.parseInt(s2);
        System.out.println("10 + 20 = " + addIntStrs.applyAsInt("10", "20"));
// 10 + 20 = 30

        Function f1 = (x) -> "<" + x;
        Function f2 = (x) -> x + ">";
        System.out.print(f2.compose(f1).apply(42));
    }
}
