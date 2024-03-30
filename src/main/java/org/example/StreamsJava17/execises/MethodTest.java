package org.example.StreamsJava17.execises;

/**
 * @author Terrance Nyamfukudza
 * 22/3/2024
 */
public class MethodTest {
    private int a = 0;
    public void showOne(int a){
        a = a;
    }

    public void showTwo(int a){
        this.a = a;
    }
    public static void main(String[] args) {
        var ct = new MethodTest();
        ct.showOne(100);
        System.out.println(ct.a);
        ct.showTwo(200);
        System.out.println(ct.a);
    }
}
