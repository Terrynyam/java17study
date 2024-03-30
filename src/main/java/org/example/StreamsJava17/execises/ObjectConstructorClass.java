package org.example.StreamsJava17.execises;

/**
 * @author Terrance Nyamfukudza
 * 21/3/2024
 */
public class ObjectConstructorClass extends B{
    public static void main(String[] args) {
        ObjectConstructorClass o = new ObjectConstructorClass();
    }

}
class B extends C{
    public B() {
        System.out.println("in B");
    }
}
class C extends AAs{
    public C() {
        System.out.println("in C");
    }
}
class AAs{
    public AAs() {
        System.out.println("in A");
    }
}
