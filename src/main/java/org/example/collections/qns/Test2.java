package org.example.collections.qns;

import java.util.*;

import static java.lang.System.out;

/**
 * @author Terrance Nyamfukudza
 * 30/1/2024
 */
public class Test2 {

    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        addRange(set1, 1);
        out.println(set1);

        ArrayList<Integer> list1 = new ArrayList<>();
        addRange(list1, 2);
        out.println(list1);

        TreeSet<Integer> set2 = new TreeSet<>();
        addRange(set2, 3);
        out.println(set2);

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        addRange(deque, 5);
        out.println(deque);
        //.................................................................................//

        set1.removeAll(list1);
        out.println(set1);

        list1.addAll(set2);
        deque.addAll(list1);
        set1.removeAll(deque);
        out.println(set1);
    }static void addRange(Collection<Integer> col, int step) {
        for (int i = step * 2; i <= 25; i += step) {
            col.add(i);
        }
    }
}
