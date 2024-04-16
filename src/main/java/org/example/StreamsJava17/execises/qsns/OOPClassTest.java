package org.example.StreamsJava17.execises.qsns;

/**
 * @author Terrance Nyamfukudza
 * 14/4/2024
 */

public class OOPClassTest{
    public static void main(String[] args) {
        OOPClassTests.A a = new OOPClassTests().new A();
        B b = new OOPClassTest().new B();
    }
    class B {
        B(){
            System.out.println(" in B");
        }
    }
}
 class OOPClassTests {
     OOPClassTests(){
         System.out.println("0");
     }
    class A{
        A(){
            System.out.println("1");
        }

    }

}

