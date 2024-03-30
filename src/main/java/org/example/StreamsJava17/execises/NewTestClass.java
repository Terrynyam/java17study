package org.example.StreamsJava17.execises;

/**
 * @author Terrance Nyamfukudza
 * 24/3/2024
 */
public class NewTestClass {
    public void method(Object o){
        System.out.println("Object Version");
    }
    public void method(java.io.FileNotFoundException s){
        System.out.println("java.io.FileNotFoundException Version");
    }
    public void method(java.io.IOException s){
        System.out.println("IOException Version");
    }
    public static void main(String args[]){
        NewTestClass tc = new NewTestClass();
        tc.method(null);
    }
}
