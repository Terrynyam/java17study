package org.example.StreamsJava17.execises;

/**
 * @author Terrance Nyamfukudza
 * 8/4/2024
 */
public class InterfaceTest2 {

    public static void main(String[] args) {
       NewBoth a = new NewBoth();
        System.out.println(a.getAddress());
    }
}
interface Offices {
    public static String getAddress() {
        return "101 Smart Str";
    }
}
class NewBoth implements Offices{
    public String getAddress() {
        return "R No 1, Home";
    }

}