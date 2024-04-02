package org.example.StreamsJava17.execises;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Terrance Nyamfukudza
 * 1/4/2024
 */
public class TestLabel {
    public static void main(String[] args) {
        var c = 0;
        JACK: while (c < 8){
            JILL: { System.out.println(c);
            if (c > 3) break JILL;
            else c++;
            }
        }
        List list = new ArrayList();
        list.add(null); //5
        list.add(null); //6
    }
}
