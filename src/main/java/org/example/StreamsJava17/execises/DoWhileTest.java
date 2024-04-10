package org.example.StreamsJava17.execises;

/**
 * @author Terrance Nyamfukudza
 * 8/4/2024
 */
public class DoWhileTest {
    public static void main(String args[]){
        var b = false;
        var i = 1;
        do{
            i++ ;
        } while (b = !b);
        System.out.println( i );
    }
}
