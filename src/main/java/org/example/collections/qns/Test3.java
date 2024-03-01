package org.example.collections.qns;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Terrance Nyamfukudza
 * 30/1/2024
 */
public class Test3 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("A"); l.add("B"); l.add("C"); l.add("D"); l.add("E");
        ListIterator<String> i = l.listIterator();
        i.next(); //A
        i.next(); //B
        i.next(); //C
        i.next(); //D
        i.remove();// removes the last return of next() thus D
        i.previous(); //C
        i.previous(); //B
        i.remove(); // removes B
        System.out.println(l);//[A, C, E]
    }
}
