package org.example.StreamsJava17.execises;

/**
 * @author Terrance Nyamfukudza
 * 24/3/2024
 */
public class BooleanTest {

        static boolean a;
        static boolean b;
        static boolean c;
        public static void main (String[] args){
            boolean bool = (a = true) || (b = true) && (c = true);// short circuiting
            System.out.println(a + ", " + b + ", " + c);

            boolean bool2 = (a = true) | (b = true) & (c = true);// all operands are evaluated
            System.out.println(a + ", " + b + ", " + c);
        }

}
