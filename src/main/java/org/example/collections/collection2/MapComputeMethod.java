package org.example.collections.collection2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Terrance Nyamfukudza
 * 3/2/2024
 */
public class MapComputeMethod {
    public static void main(String... args){
        Map<Integer, String> etnMap = new HashMap<>();
        etnMap.put(112, "Norway");
        etnMap.put(999, "UK");
        etnMap.put(190, null);
        etnMap.put(911, null);

        //assigning a null to a key tha is mapped the key and value are removed
        etnMap.compute(112, (key, oVal) -> null); // (7) null, removed
        System.out.println(etnMap);//{999=UK, 190=null, 911=null}

        etnMap.compute(999, (key, oVal) -> "Uganda"); // (8) Uganda, updated
        etnMap.compute(190, (key, oVal) -> null); // (9) null, removed
        System.out.println(etnMap);//{999=Uganda, 911=null}
        etnMap.compute(911, (key, oVal) -> "USA"); // (10) USA, updated
        etnMap.compute(100, (key, oVal) -> null); // (11) null, no action
        etnMap.compute(110, (key, oVal) -> "China"); // (12) China, inserted
    }
}
