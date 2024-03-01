package org.example.collections.qns;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Terrance Nyamfukudza
 * 30/1/2024
 */
public class Test1 {

    public static void main(String[] args) {
        int sum = 0;
        for (int i : makeCollection()) {
            sum += i;
        }
        System.out.println(sum);
    } static Collection<Integer> makeCollection() {
        System.out.println("A collection coming up.");
        Collection<Integer> collection = new ArrayList<>();
        collection.add(10); collection.add(20); collection.add(30);
        return collection;
    }
}
