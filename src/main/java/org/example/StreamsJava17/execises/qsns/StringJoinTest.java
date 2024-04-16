package org.example.StreamsJava17.execises.qsns;

import java.util.ArrayList;

/**
 * @author Terrance Nyamfukudza
 * 14/4/2024
 */
public class StringJoinTest {
    public static void main(String[] args) {
        var list = new ArrayList();
        list.add("Take");
        list.add("The");
        list.add("Risk");
        System.out.println(String.join(".",list));
    }
}
