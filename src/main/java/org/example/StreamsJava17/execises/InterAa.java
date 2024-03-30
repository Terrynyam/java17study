package org.example.StreamsJava17.execises;

/**
 * @author Terrance Nyamfukudza
 * 22/3/2024
 */

class InterAa implements I1, I2{
    public void m1() { System.out.println("Hello"); }
    public static void main(String[] args){
        InterAa tc = new InterAa();
        ( (I1) tc).m1();
    }
}
interface I1{
    int VALUE = 1;
    void m1();
}
interface I2{
    int VALUE = 2;
    void m1();
}