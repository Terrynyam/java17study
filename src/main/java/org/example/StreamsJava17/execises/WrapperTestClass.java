package org.example.StreamsJava17.execises;

/**
 * @author Terrance Nyamfukudza
 * 10/4/2024
 */
public class WrapperTestClass {
        public static Integer wiggler(Integer x){
            float a = 1;
            Float b = 2f;
            Integer y = x + 10;
            x++;
            System.out.println(x);
            return y;
        }

        public static void main(String[] args){
            Integer dataWrapper = Integer.valueOf(5);
            Integer value = wiggler(dataWrapper);
            System.out.println(dataWrapper+value);
        }
}
