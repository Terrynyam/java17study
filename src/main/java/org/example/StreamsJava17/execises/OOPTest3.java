package org.example.StreamsJava17.execises;

/**
 * @author Terrance Nyamfukudza
 * 22/3/2024
 */
public class OOPTest3 {
    static int a = 0;
    int b = 5;
    public void foo()
    {
        while(b>0){
            b--;
            a++;
        }
    }
    public static void main(String[] args) {
        var p1 = new OOPTest3();
        p1.foo();
        var p2 = new OOPTest3();
        p2.foo();
        System.out.println(p1.a+" "+p2.a);

        // The field a is static and there will be only one copy of a no matter how
        // many instances of Test you create. Changes made to it by one instance will be
        // reflected in the other instance as well. But field b is an instance field.
        // Each instance of Test will get its on copy of b.  Therefore, when you call p1.foo()
        // and then p2.foo(), the same field a is incremented 5 times twice and so it will print
        // 10 10.
    }
}
