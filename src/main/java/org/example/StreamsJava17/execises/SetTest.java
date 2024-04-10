package org.example.StreamsJava17.execises;

import java.util.TreeSet;

/**
 * @author Terrance Nyamfukudza
 * 22/3/2024
 */
public class SetTest {
    public static void main(String[] args) {
        TreeSet<Integer> s = new TreeSet<Integer>();
        TreeSet<Integer> subs = new TreeSet<Integer>();
        for(int i = 324; i<=328; i++)
        {
            s.add(i);
        }
        //subs = (TreeSet) s.subSet(326,  328);
        subs = (TreeSet) s.subSet(326, true, 328, true );
      //  subs.add(329);// this will cause an exception "key out of range" as 329 is not in the set
        System.out.println(s+" "+subs);
        //----------------------------------------------------------------
        TreeSet<Integer> s2 = new TreeSet<Integer>();
        for(int i = 1; i<=10; i++)
        {
            s2.add(i);
        }
        System.out.println(s2);
        var a = s2.addAll(s);
        System.out.println(a);
        System.out.println(s2);
        var b = s2.removeAll(s);
        System.out.println(s2);
        System.out.println(b);


    }
}
