package org.example;

/**
 * @author Terrance Nyamfukudza
 * 29/11/2023
 */
public class StaticMain {
    public static void main(String[] args) {
        Parent.staticMethod(); // Output: Static method in Parent class
        Child.staticMethod();  // Output: Static method in Child class

        // Using references
        Parent parentReference = new Child();
        parentReference.staticMethod(); // Output: Static method in Parent class
    }
}
class Parent {
    static void staticMethod() {
        System.out.println("Static method in Parent class");
    }
}

class Child extends Parent {
    static void staticMethod() {
        System.out.println("Static method in Child class");
    }
}
