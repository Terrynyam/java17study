package org.example.StreamsJava17.execises;

/**
 * @author Terrance Nyamfukudza
 * 8/4/2024
 */
public class InterfaceAndClassTest {
    public static void main(String[] args) {
        Office off = new HomeOffice();  //1
//        System.out.println(off.getAddress()); //2  (Office.getAddress())Static method may be invoked on containing
//        interface class only
        System.out.println(Office.getAddress());
    }
}
interface House{
    public default String getAddress(){
        return "101 Main Str";
    }
}
interface Office {
    public static String getAddress(){
        return "101 Smart Str";
    }
}
interface WFH extends House, Office{
    private boolean isOffice(){ return true;
    }
}
class HomeOffice implements House, Office{
    public String getAddress(){
        return "R No 1, Home";
    }
}
