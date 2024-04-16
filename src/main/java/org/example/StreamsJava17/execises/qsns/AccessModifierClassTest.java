package org.example.StreamsJava17.execises.qsns;

/**
 * @author Terrance Nyamfukudza
 * 14/4/2024
 */
public class AccessModifierClassTest {
    public static void main(String[] args) {
        Child a = new Child();
        //Parent a = new Child();// making parent reference point to Child Object
        //System.out.println(a.var);
    }
}
class Parent{
    int x = 12;
    int var = 1000;
    int getVar(){
        return var;
    }
}
class Child extends Parent{

    int x = 500;
    private int var = 2000;// removing private access or
    // removing this method will make var from Parent accessible
    int getVar(){
        return super.var;// return var => 2000
    }
}
