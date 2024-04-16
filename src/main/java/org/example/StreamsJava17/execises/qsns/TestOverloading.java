package org.example.StreamsJava17.execises.qsns;

/**
 * @author Terrance Nyamfukudza
 * 14/4/2024
 */
public class TestOverloading {
    public static void main(String[] args) {
        byte m = 10;
        speed(m,m);//ola
        speed(m);// In Byte
        m('A');//1
        m('a');
        m('A','B');//2
        m('A','B','C');//3
        m('A','B','C','D');//3
    }
    static void speed (Byte... s){
        System.out.println("Ola");
    }
    static void speed (Byte s){
        System.out.println("In Byte");
    }
    static void m (int a){
        System.out.println("1");
        System.out.println(a);
    }
    static void m (int a,int b){
        System.out.println("2");
    }
    static void m (char... a){
        System.out.println("3");
    }
}
class TheOverloading{

}
