package org.example.StreamsJava17.execises;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Terrance Nyamfukudza
 * 18/3/2024
 */
public class DequeTest {
    public static void main(String[] args) {
        Deque<Integer> d = new ArrayDeque<>();
        d.push(1);
        d.push(2);
        d.push(3);
        System.out.println(d.remove());
        System.out.println(d.remove());
        System.out.println(d.remove());
    }
}
