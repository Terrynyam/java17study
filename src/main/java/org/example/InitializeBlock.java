package org.example;

/**
 * @author Terrance Nyamfukudza
 * 28/12/2023
 */
public class InitializeBlock {
    int a;
    int b;
    static int c;
    public static void main(String... args){
        InitializeBlock a = new InitializeBlock();
        a.these();
    }
    void these(){
        System.out.println(c);
    }
    InitializeBlock(){
        System.out.println(a);
        System.out.println(b);
    }
    {
        // an initialize block overrides the instance fields
        a=10;
        b=20;
    }
}
