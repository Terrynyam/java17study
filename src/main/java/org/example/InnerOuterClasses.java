package org.example;

/**
 * @author Terrance Nyamfukudza
 * 26/12/2023
 */
public class InnerOuterClasses {
    public static void main(String[] args) {
        Outer objRef = new Outer();
        System.out.println(objRef.createInner().getSecret());
    }
}
class Outer {
    private int secret;
    Outer() { secret = 123; }
    class Inner {
        int getSecret() { return secret; }
    }
    Inner createInner() { return new Inner(); }
}

