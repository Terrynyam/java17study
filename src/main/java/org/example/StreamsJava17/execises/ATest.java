package org.example.StreamsJava17.execises;

/**
 * @author Terrance Nyamfukudza
 * 22/3/2024
 */
public class ATest {
    String global = "111";
    public int parse(String arg){
        var value = 0;
        try{
            String global = arg;
            value = Integer.parseInt(global);
        }
        catch(Exception e){
            System.out.println(e.getClass());
        }
        System.out.print(global+" "+value+" ");
        return value;
    }
    public static void main(String[] args) {
        ATest ct = new ATest();
        System.out.print(ct.parse("333"));
    }
    // Observe that a new local variable named global is defined within a try block. It is
    // accessible only within the try block. It also shadows the instance field of the same
    // name global within the try block. It is this variable that is used in parseInt. Therefore,
    // value is set to 333.However, when you print global in parse method, the global defined in the try block
    // is out of scope and the instance field named global is used. Therefore, it prints 111.

}
