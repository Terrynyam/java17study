package org.example.StreamsJava17.execises;

/**
 * @author Terrance Nyamfukudza
 * 31/3/2024
 */
public class TestOOPClass {
    public static void main(String args[])
    {
        As ab = new Bs();
        As ac = new Cs();
        if( ac instanceof Bs b1){
            b1.b();
            if(b1 instanceof Cs c1){
                c1.c();
            }
        }else{
            ac.a();
        }
    }
}
class As {
    void a(){ System.out.println("a");
    }
}
class Bs extends As {
    void b(){ System.out.println("b");
    }
}
class Cs extends Bs {
    void c(){ System.out.println("c");
    }
}
