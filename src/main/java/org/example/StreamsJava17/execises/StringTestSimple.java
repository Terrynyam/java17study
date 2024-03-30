package org.example.StreamsJava17.execises;

/**
 * @author Terrance Nyamfukudza
 * 19/3/2024
 */
public class StringTestSimple {

    static boolean validateInput(String input){
        return !input.isBlank();
    }
    public static void main(String[] args) {
        System.out.println(validateInput("terrance and"));

        String a = "a";
        String b = "a";
        System.out.println((a == b)+" "+a.equals(b));

    }
}
