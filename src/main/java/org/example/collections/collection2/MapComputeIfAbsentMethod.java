package org.example.collections.collection2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Terrance Nyamfukudza
 * 3/2/2024
 */
public class MapComputeIfAbsentMethod {
    public static void main(String... args){
        Map<Integer, String> etnMap = new HashMap<>();
        etnMap.put(112, "Norway");
        etnMap.put(999, "UK");
        etnMap.put(190, null);
        etnMap.put(911, null);

        // Before: {112=Norway, 999=UK, 190=null, 911=null}
        etnMap.computeIfAbsent(112, key -> null); // (13) Norway, no change
        etnMap.computeIfAbsent(999, key -> "Uganda"); // (14) UK, no change
        etnMap.computeIfAbsent(190, key -> null); // (15) null, no change
        etnMap.computeIfAbsent(911, key -> "USA"); // (16) USA, updated
        etnMap.computeIfAbsent(100, key -> null); // (17) null, no action
        etnMap.computeIfAbsent(110, key -> "China"); // (18) China, inserted
// After: {112=Norway, 110=China, 999=UK, 190=null, 911=USA}
    }
}
