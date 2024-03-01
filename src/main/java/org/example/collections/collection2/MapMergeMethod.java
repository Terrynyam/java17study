package org.example.collections.collection2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Terrance Nyamfukudza
 * 3/2/2024
 */
public class MapMergeMethod {
    public static void main(String... args){
        Map<Integer, String> etnMap = new HashMap<>();
        etnMap.put(112, "Norway");
        etnMap.put(999, "UK");
        etnMap.put(190, null);
        etnMap.put(911, null);

        System.out.println(etnMap);// {112=Norway, 999=UK, 190=null, 911=null}
//note when using the merge() method -- if the key is not null then the return of the merge method is used
        //else the value passed in the method is used

        etnMap.merge(112, "Mordor", (oVal, value) -> null); // (1) null, removed

        System.out.println(etnMap);//{999=UK, 190=null, 911=null}

        etnMap.merge(999, "Mordor", (oVal, value) -> "Uganda"); // (2) Uganda, updated
        System.out.println(etnMap);//{999=Uganda, 190=null, 911=null}
        etnMap.merge(190, "Mordor", (oVal, value) -> null); // (3) Mordor, updated
        System.out.println(etnMap);//{999=Uganda, 190=Mordor, 911=null}
        etnMap.merge(911, "Mordor", (oVal, value) -> "USA"); // (4) Mordor, updated
        System.out.println(etnMap);//{999=Uganda, 190=Mordor, 911=Mordor}

        //merging a new key makes a new value to be inserted and mapped to the new key
        //and the value passed to the merge method is used

        etnMap.merge(100, "Mordor", (oVal, value) -> null); // (5) Mordor, inserted
        System.out.println(etnMap);//{100=Mordor, 999=Uganda, 190=Mordor, 911=Mordor}
        etnMap.merge(110, "Mordor", (oVal, value) -> "China"); // (6) Mordor, inserted
        System.out.println(etnMap);//{100=Mordor, 999=Uganda, 110=Mordor, 190=Mordor, 911=Mordor}
    }
}
