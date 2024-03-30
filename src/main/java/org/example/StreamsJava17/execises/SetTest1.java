package org.example.StreamsJava17.execises;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Terrance Nyamfukudza
 * 29/3/2024
 */
public class SetTest1 {

    String s1 = "green mile";   // 0
    public void generateReport( int n ){
        String local;   // 1
        if( n > 0 ) local = "good";   //2
        else local = "bad";
        System.out.println( s1+" = " + local );   //3
         }
    public static void main(String[] args) {
        ArrayList<String> als = new ArrayList<>(List.of("a", "b", "c"));
        Set<String> ss = new HashSet();
        ss.addAll(als); //1
        als.clear();    //2
        System.out.println(ss.size());
    }
}
