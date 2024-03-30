package org.example.StreamsJava17.execises;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Terrance Nyamfukudza
 * 24/3/2024
 */
public class StreamTestClass {
    public static void main(String[] args) {
        var tickers = List.of("A", "D", "E", "C", "A");
        var ratio = List.of(1.0, 1.2, 1.5, 1.8, 2.0);
        var map1 = IntStream.range(0, tickers.size())
                .boxed()
                .collect(Collectors.toMap
                        (i -> tickers.get(i), i -> 1.0/ratio.get(i), (x, y) -> x+y)) ;  //<<----- LINE 1
        var map2 = map1.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .collect(
                        Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (x, y) -> x-y,
                                LinkedHashMap::new)
                );  //<<----- LINE 2
        map2.forEach((var k, var v)->System.out.printf("%s = %.2f\n",k, v));
    }
}
