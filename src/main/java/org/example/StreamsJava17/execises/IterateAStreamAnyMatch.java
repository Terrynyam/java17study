package org.example.StreamsJava17.execises;

import java.util.Arrays;
import java.util.List;

/**
 * @author Terrance Nyamfukudza
 * 28/3/2024
 */
public class IterateAStreamAnyMatch {
    public static void main(String[] args) {
        List<String> values = Arrays.asList("Java EE", "C#", "Python");
        boolean flag = values.stream().allMatch(str->{
            System.out.println("Testing: "+str);
            return str.equals("Java");
        });
        System.out.println(flag);

        //-------------------------------------------------------------------

        List<String> valuess = Arrays.asList("C#", "Java", "Python");
        valuess.stream().allMatch(a->a.equals("Java"));
    }
}
