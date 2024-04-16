package org.example.StreamsJava17.execises.qsns;

/**
 * @author Terrance Nyamfukudza
 * 14/4/2024
 */
public class InstanceOfClassTest {
    public static void main(String[] args) {

        A a = new C();
        Object o = new Object();

        if(a instanceof B){
            System.out.println("is an instance");
        }
        if(a instanceof C c){
            System.out.println("instance");
        }
    }
}
class A{}
class B extends A{}
class C extends B{}
class D{}

