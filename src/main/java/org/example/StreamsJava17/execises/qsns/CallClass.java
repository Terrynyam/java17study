package org.example.StreamsJava17.execises.qsns;

/**
 * @author Terrance Nyamfukudza
 * 15/4/2024
 */
public class CallClass {
    CallClass(){
        System.out.println(this);
    }
    static void amen(){
        System.out.println("Super Amen");
    }

    @Override
    public String toString() {
        return "super.toString()";
    }

}
class  TheClass extends CallClass{
    //void amen(){ this wont compile as this is not static
    //    System.out.println("Super Amen");
//    }
        static void amen(){
        System.out.println("Super Amen");
    }

    public static void main(String[] args) {
        CallClass a = new CallClass();
    }

}
