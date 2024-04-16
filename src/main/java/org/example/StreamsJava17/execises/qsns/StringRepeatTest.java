package org.example.StreamsJava17.execises.qsns;

/**
 * @author Terrance Nyamfukudza
 * 14/4/2024
 */
public class StringRepeatTest {
    public static void main(String[] args) {
        String str ="*";
//        str =str.repeat(5);
//        System.out.println(str);
//        for(var var =0 ;var<4;var++){
//            System.out.println("*");
//        }
        for(var var =0 ;var<4;var++){str += "*";}
        System.out.println(str);
    }
}
