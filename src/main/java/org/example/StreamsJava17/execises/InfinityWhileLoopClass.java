package org.example.StreamsJava17.execises;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Terrance Nyamfukudza
 * 24/3/2024
 */
public class InfinityWhileLoopClass {
    public static void main(String[] args) {
        List s1 = new ArrayList( );
        try{
            while(true){
                s1.add("sdfa");
            }
        }catch(RuntimeException e){
            e.printStackTrace();
        }
        System.out.println(s1.size());
    }
}
