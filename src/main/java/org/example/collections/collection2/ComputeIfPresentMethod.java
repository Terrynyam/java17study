package org.example.collections.collection2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Terrance Nyamfukudza
 * 3/2/2024
 */
public class ComputeIfPresentMethod {
    public static void main(String... args) {
        Map<Integer, String> etnMap = new HashMap<>();
        etnMap.put(112, "Norway");
        etnMap.put(999, "UK");
        etnMap.put(190, null);
        etnMap.put(911, null);

        // Before: {112=Norway, 999=UK, 190=null, 911=null}
        etnMap.computeIfPresent(112, (key, oVal) -> null); // (19) null, removed
        etnMap.computeIfPresent(999, (key, oVal) -> "Uganda"); // (20) Uganda, updated
        etnMap.computeIfPresent(190, (key, oVal) -> null); // (21) null, no change
        etnMap.computeIfPresent(911, (key, oVal) -> "USA"); // (22) null, no change
        etnMap.computeIfPresent(100, (key, oVal) -> null); // (23) null, no action
        etnMap.computeIfPresent(110, (key, oVal) -> "China"); // (24) null, no action
// After: {999=Uganda, 190=null, 911=null}
    }
}
