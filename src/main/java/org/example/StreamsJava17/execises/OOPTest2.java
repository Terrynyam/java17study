package org.example.StreamsJava17.execises;

/**
 * @author Terrance Nyamfukudza
 * 22/3/2024
 */
public class OOPTest2 {
    public static void main(String[] args) {
        var out = new Outer();
        System.out.println(out.getInner().getOi());
    }
}
class Outer {
    private int oi = 20;
    class Inner
    {
        int getOi() {
            return oi;
        }
    }
    Inner getInner() {
        return new Inner() ;
    }
}
