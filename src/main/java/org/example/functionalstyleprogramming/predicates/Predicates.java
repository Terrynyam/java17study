package org.example.functionalstyleprogramming.predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

/**
 * @author Terrance Nyamfukudza
 * 5/2/2024
 */
public class Predicates {
    public static void main(String... args) {
//        Predicate<String> isPalindrome
//                = str -> new StringBuilder(str).reverse().toString().equalsIgnoreCase(str);
//        // Before: [Otto, ADA, Alyah, Bob, HannaH, Java]
//        words.removeIf(isPalindrome); // Remove all palindromes.
//        // After: [Alyah, Java]
//
//        Predicate<String> isEvenLen = str -> str.length() % 2 == 0;
//        // Before: [Otto, ADA, Alyah, Bob, HannaH, Java]
//        words.removeIf(isEvenLen); // Remove all even length words.
//        // After: [ADA, Alyah, Bob]

//        Predicate<String> startsWithA = str -> str.startsWith("A");
//        // Before: [Otto, ADA, Alyah, Bob, HannaH, Java]
//        words.removeIf(startsWithA); // Remove all words that start with "A".
//        // After: [Otto, Bob, HannaH, Java

        Predicate<String> isEqualToTarget = Predicate.isEqual("Ada");
        System.out.println(isEqualToTarget.test("Adda")); // false.
        System.out.println(Predicate.isEqual("Ada").test("Ada")); // true.
        System.out.println(Predicate.isEqual("null").test("null")); // true.

        Predicate<Integer> isEven = i -> i % 2 == 0; // Operand unboxed.
        System.out.println("2021 is an even number: "
                + isEven.test(2021)); // Argument boxed. false.

        IntPredicate isEvenInt = i -> i % 2 == 0; // No unboxing.
        System.out.println("2021 is an even number: "
                + isEvenInt.test(2021)); // No boxing. false.

        IntPredicate isOddInt = isEvenInt.negate(); // Negating a predicate.
        System.out.println("2020 is an odd number: "
                + isOddInt.test(2020)); // false.
        IntPredicate isInRange = i -> -100 <= i && i <= 100; // Range: [-100, 100]
        System.out.println("21 is in range and odd: "
                + isInRange.and(isOddInt).test(21));// true.
    }

}
