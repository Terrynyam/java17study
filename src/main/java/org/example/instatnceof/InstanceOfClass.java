package org.example.instatnceof;

/**
 * @author Terrance Nyamfukudza
 * 10/1/2024
 */
public class InstanceOfClass {
    public static void main(String... args){
        // Instance of pattern matcher
        Object obj = "these";
        //right operand must be the subtype of the left expression type(left operand)
        var result = obj instanceof String;// result = true
        if(obj instanceof String){// instance of pattern matching
            String str = (String) obj;
            System.out.println(str);
        }

        // instance of type Comparison
        String str = "Hello";
        Integer number = 42;

        //left operand must be the subtype of the right expression type(right operand)
        System.out.println(str instanceof String);   // true
        System.out.println(number instanceof Integer);   // true
        System.out.println(number instanceof Number);   // true
        //System.out.println(number instanceof String);   // false
    }
}

