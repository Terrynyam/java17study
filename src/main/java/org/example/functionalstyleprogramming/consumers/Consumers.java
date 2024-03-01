package org.example.functionalstyleprogramming.consumers;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

/**
 * @author Terrance Nyamfukudza
 * 5/2/2024
 */
public class Consumers {
    public static void main(String... args){

        Consumer<Double> formatter = d -> System.out.printf("Value: %.2f%n", d);
        formatter.accept(3.145); // Value: 3.15

        StringBuilder sb1 = new StringBuilder("Banana");

        Consumer<StringBuilder> resizeSB = sb -> sb.setLength(4);
        resizeSB.accept(sb1); // Bana
        Consumer<StringBuilder> reverseSB = sb -> sb.reverse();
        reverseSB.accept(sb1); // anaB
        Consumer<StringBuilder> printSB
                = sb -> System.out.println("StringBuilder: " + sb);
        printSB.accept(sb1); // StringBuilder: anaB

        resizeSB.andThen(reverseSB)
                .andThen(printSB).accept(new StringBuilder("Banana")); // StringBuilder: anaB

        //Primitive Type Specializations of Consumer<T>
        IntConsumer sqrt = i -> System.out.printf("%.2f%n", Math.sqrt(i));
        IntConsumer sqr = i -> System.out.printf("%d%n", i * i);
        sqrt.andThen(sqr).accept(15); // 3.87
        // 225

        //Two-Arity Specialization of Consumer<T>: BiConsumer<T, U>
        BiConsumer<String, Double> formatPrinter
                = (format, obj) -> System.out.printf(format, obj);
        formatPrinter.accept("Math.PI:|%10.3f|%n", Math.PI); // Math.PI:| 3.142|

        //Primitive Type Specializations of BiConsumer<T, U>
        ObjIntConsumer<StringBuilder> resizeSB2 = (sb, len) -> sb.setLength(len);
        StringBuilder sb2 = new StringBuilder("bananarama");
        resizeSB2.accept(sb2, 6); // The required length passed as a parameter.
        System.out.println("StringBuilder resized: " + sb2);
// StringBuilder resized: banana
    }
}
