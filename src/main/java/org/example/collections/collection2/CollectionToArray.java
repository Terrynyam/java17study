package org.example.collections.collection2;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.function.IntFunction;

/**
 * @author Terrance Nyamfukudza
 * 22/1/2024
 */
public class CollectionToArray {
    public static void main(String[] args) {
        Collection<String> strSet = new HashSet<>();
        strSet.add("2021"); strSet.add("2022"); strSet.add("2023");
        int n = strSet.size();
        Object[] objects = strSet.toArray(); // (1)

// String[] string = strSet.toArray(); // (2) Compile-time error!... Object is not a subtype of String
        // strSet.toArray(); by not specifying the array type and size in the toArray method the default
        // set will be the Object[]

        Object[] objArray = strSet.toArray(new Object[0]); // (3) Array size of zero
        // the size being set is zero but the method create a suit.able size array tha will be suitable for the for
        //objects stored in it of String

        System.out.println("Array size: " + objArray.length);//Array size: 3
        System.out.println("Array type: " + objArray.getClass().getName());//Array type: [Ljava.lang.Object;
        System.out.println("Actual element type: " +
                objArray[0].getClass().getName());//Actual element type: java.lang.String
        String[] strArray1 = new String[0];
        String[] strArray2 = strSet.toArray(strArray1); // (4)
        System.out.println("Arrays.toString(strArray2 = " + Arrays.toString(strArray2));
        System.out.println("strArray1 == strArray2: " + (strArray1 == strArray2));
        String[] strArray3 = new String[n];
        String[] strArray4 = strSet.toArray(strArray3); // (5)
        System.out.println("strArray3 == strArray4: " + (strArray3 == strArray4));

// Integer[] intArray = strSet.toArray(new Integer[n]); // (6) Runtime error!

        IntFunction<String[]> createStrArray = nn -> new String[nn]; // (7)
        String[] strArray5 = strSet.toArray(createStrArray); // (8a)
        String[] strArray6 = strSet.toArray(String[]::new); // (8b)
        String[] strArray7 = strSet.toArray(createStrArray.apply(0)); // (8c)
        System.out.println("strArray5: " + Arrays.toString(strArray5));
        System.out.println("strArray6: " + Arrays.toString(strArray6));
        System.out.println("strArray7: " + Arrays.toString(strArray7));
    }
}
