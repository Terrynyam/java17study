package org.example.StreamsJava17.execises;

/**
 * @author Terrance Nyamfukudza
 * 19/3/2024
 */
public class OOPTest extends Car{
    public int gearRatio = 9;
    public String accelerate() {  return  "Accelerate : OOPTest";  }
    public static void main(String[] args){
        Car c = new OOPTest();
        Car a = new Car();
        OOPTest o = new OOPTest();
        System.out.println(o.gearRatio+"  "+o.accelerate());
        System.out.println(a.gearRatio+"  "+a.accelerate());
        System.out.println( c.gearRatio+"  "+c.accelerate() );
    }
}
class Car{
    public int gearRatio = 8;
    public String accelerate() {  return "Accelerate : Car";  }
}
//Always remember: Instance methods are overridden and variables (and static methods) are hidden.
// Which instance method is invoked depends on the class of the actual object, while which field
// (and static method) is accessed depends on the class of the variable.  Method to be executed
// depends on the class of the actual object the variable is referencing to. Here, c refers to
// object of class SportsCar so SportsCar's accelerate() is selected.