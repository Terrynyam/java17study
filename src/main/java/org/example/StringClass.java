package org.example;

/**
 * @author Terrance Nyamfukudza
 * 20/12/2023
 */
public class StringClass {
    public static void main(String... args){
        String a = new String("Terry");// new object is created but never pooled
        String b = "Terry";
        String z = "ry";
        String c = "Ter"+z;//new object is created but never pooled
        System.out.println(a==b);//false
        System.out.println(a==c);//false
        System.out.println(b==c);//false
        System.out.println(a+" "+b+" "+c);
        String str1 = "The Case was thrown out of Court";
        String str2 = "the case was thrown out of court";
        int compVal1 = str1.compareTo(str2);
        System.out.println(compVal1);

        String before = " withspace";
        String after = "withspace ";
        String both = " withspace ";

        System.out.println(before +after);
        System.out.println(before+both+after);
        System.out.println(before.strip());
        System.out.println(before+both.strip()+after);
        System.out.println((before+both+after).strip());

    }
}
