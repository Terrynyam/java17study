package org.example;

/**
 * @author Terrance Nyamfukudza
 * 21/12/2023
 */
public class StringBuilderClass {
    public static void main(String... args) {
        StringBuilder strBuilder = new StringBuilder("Java"); // "Java", capacity 20
        char charFirst = strBuilder.charAt(0); // 'J'
        char charLast = strBuilder.charAt(strBuilder.length() - 1); // 'a'
        System.out.println(charFirst);
        System.out.println(charLast);
        System.out.println(strBuilder);//Java
        System.out.println(strBuilder.reverse());
        //.............................................................
        StringBuilder builder = new StringBuilder("No strings attached!");
        System.out.println("Builder contents: " + builder);
        System.out.println("Builder length: " + builder.length());
        System.out.println("Builder capacity: " + builder.capacity());
        System.out.println("Ensure capacity of 40");
        builder.ensureCapacity(40);
        System.out.println("Builder capacity: " + builder.capacity());
        System.out.println("Trim to size");
        builder.trimToSize();
        System.out.println("Builder length: " + builder.length());
        System.out.println("Builder capacity: " + builder.capacity());
        System.out.println("Set length to 10");
        builder.setLength(10);
        System.out.println("Builder length: " + builder.length());
        System.out.println("Builder contents: " + builder);
        System.out.println("Set length to 0");
        builder.setLength(0);
        System.out.println("Builder is empty: " + (builder.length() == 0));
        //.....................................................

        StringBuilder sb = new StringBuilder("  1234  ");
        sb.trimToSize();//only changes the capacity to match the length of the string builder
        sb.append("!");
        System.out.println(sb);//  1234  !
        sb.reverse();//!  4321  //
        sb.setLength(5);
        System.out.println("|" + sb + "|");
    }
}
