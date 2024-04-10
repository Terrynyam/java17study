package org.example.StreamsJava17.execises;

/**
 * @author Terrance Nyamfukudza
 * 5/4/2024
 */
public class SubStringTestClass {
    public static void main(String[] args) {
        String str = "Hello World";
                    //0 1 2 3 4 5 6 7 8 9 10
                    //H e l l o   W o r l d
        System.out.println(str.substring(6));
        System.out.println(str.substring(6, 11));
    }
}
