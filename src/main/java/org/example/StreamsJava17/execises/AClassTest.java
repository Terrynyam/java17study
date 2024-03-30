package org.example.StreamsJava17.execises;


/**
 * @author Terrance Nyamfukudza
 * 20/3/2024
 */
public class AClassTest extends A {
    int i =   4;
    public static void main(String[] args) {
        A a = new AClassTest();
        a.print();
    }
    void print() { System.out.print(i+" "); }
}
class A{
    A() {  print();   }
    void print() { System.out.print("A "); }
}
