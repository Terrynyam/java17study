package org.example.StreamsJava17.execises.qsns;

/**
 * @author Terrance Nyamfukudza
 * 14/4/2024
 */
public class TestVariables {
    int var = 1000;
    int getVar(){
        return var;
    }
    public static void main(String[] args) {
        int a = new TestVariables().getVar();
        System.out.println(a);
    }
}
