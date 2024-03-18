package org.example.StreamsJava17;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Terrance Nyamfukudza
 * 15/3/2024
 */
public class IntermediateOperations {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.filter(x -> x.startsWith("m"))
                .forEach(System.out::println); // monkey

        //---------------------------------------------------------------
        Stream<String> s1 = Stream.of("duck", "duck", "duck", "goose");
        s1.distinct().forEach(System.out::print); // duckgoose

        System.out.println();
        //----------------------------------

        Stream<Integer> s2 = Stream.iterate(1, n -> n + 1);
        s2.skip(5)//skips 1 to 5 elements
                .limit(2)
                .forEach(System.out::print); // 67

        System.out.println();

        //---------------------------------------------------------------
        Stream<String> s3 = Stream.of("monkey", "gorilla", "bonobo");
        s3.map(String::length)
                .forEach(System.out::print); // 676

        System.out.println();

        //---------------------------------------------------------------
        List<String> zero = List.of();
        var one = List.of("Bonobo");
        var two = List.of("Mama Gorilla", "Baby Gorilla");
        Stream<List<String>> animals = Stream.of(zero, one, two);
        animals.flatMap(mm -> mm.stream())
                .forEach(System.out::println);

//        var animals2 = animals.flatMap(mm -> mm.stream()).collect(Collectors.toList());
//        System.out.println(animals2);

        //---------------------------------------------------------------
        var stream = Stream.of("black bear", "brown bear", "grizzly");
        long count = stream.filter(s4 -> s4.startsWith("g"))
                .peek(System.out::println).count(); // grizzly
        System.out.println(count);
    }
}
