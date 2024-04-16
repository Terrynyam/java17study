package org.example.StreamsJava17.execises.qsns;

/**
 * @author Terrance Nyamfukudza
 * 14/4/2024
 */
public class HorseTestClass {
    public static void main(String[] args) {
        Animal horse = new Horse();
        //((Horse)horse).ride("emma");//works
//        ((Rideable)horse).ride("emma");//works
        //((Rideable)(Horse)horse).ride("emma");//works
        ((Horse)(Rideable)horse).ride("emma");
    }
}
interface Rideable{
    void ride(String name);
}
class Animal{}
class Horse extends Animal implements Rideable{

    @Override
    public void ride(String name) {
        System.out.println(name.toUpperCase() + " IS RIDING A HORSE");
    }
}
