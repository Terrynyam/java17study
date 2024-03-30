package org.example.StreamsJava17.execises;

/**
 * @author Terrance Nyamfukudza
 * 29/3/2024
 */
public class StringBuilderClassTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("123456");
        System.out.println(sb.capacity());
        sb.setLength(5);
        sb.setLength(10);
        System.out.println(sb.length());
        System.out.println(sb);
        System.out.println(sb.capacity());
    }
}
