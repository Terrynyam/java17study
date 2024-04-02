package org.example.StreamsJava17.execises;

/**
 * @author Terrance Nyamfukudza
 * 1/4/2024
 */
public class ClassesOOPTest {


    public static void main(String[] args) {
        Bb a= new Bb();
        System.out.println(a.i);
    }
}
class Aa{
    private int i = 10;
}
class Bb extends Aa{
    public int i = 10;
}
class Cc extends Bb{
    private int i = 10;
}
