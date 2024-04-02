package org.example.StreamsJava17.execises;

/**
 * @author Terrance Nyamfukudza
 * 2/4/2024
 */
public class StaticTest {
    void m1(){
        StaticTest.m2();  // 1
        m4();             // 2
        StaticTest.m3();  // 3  using m3() only is valid
    }

    static void m2(){ }  // 4

    void m3(){
        m1();            // 5
        m2();            // 6
        StaticTest.m1(); // 7  using m1() only is valid
    }

    static void m4(){ }
}
