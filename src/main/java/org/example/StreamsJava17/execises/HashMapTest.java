package org.example.StreamsJava17.execises;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Terrance Nyamfukudza
 * 4/4/2024
 */
public class HashMapTest {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> concurrentMap = new ConcurrentHashMap<>();

        // Adding null key and value
        concurrentMap.put("null", "value1");
        concurrentMap.put("key2", "null");

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(null, null);
        hashMap.put(null, "null");
        hashMap.put("key1", "value1");
        hashMap.put("key2", "value2");
        hashMap.put("key2", "value2");

        System.out.println(hashMap);
    }
}
