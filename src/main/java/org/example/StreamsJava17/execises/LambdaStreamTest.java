package org.example.StreamsJava17.execises;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Terrance Nyamfukudza
 * 20/3/2024
 */
public class LambdaStreamTest {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("a", 1);
        map1.put("b", 1);
        map1.merge("b", 1, (i1, i2)->i1+i2);
        map1.merge("c", 3, (i1, i2)->i1+i2);
        System.out.println(map1);
    }
}
