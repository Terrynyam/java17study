package org.example.functionalstyleprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * @author Terrance Nyamfukudza
 * 11/2/2024
 */
public class ReviewQsn {
    public static void main(String... args){
            List<String> values = new ArrayList<>(List.of("ONE","TWO","THREE","FOUR"));
            //Removes all of the elements of this collection that satisfy the
        // given predicate. Errors or runtime exceptions thrown during iteration or
        // by the predicate are relayed to the caller.
        //filter – a predicate which returns true for elements to be removed
            values.removeIf(s -> s.length() == 3);
            int sum = 0;
            for (String value: values) {
                sum += value.length();
            } System.out.println(sum);

        Function f1 = (x) -> "<" + x;
        Function f2 = (x) -> x + ">";
        System.out.print(f2.compose(f1).apply(42));
    }
}
