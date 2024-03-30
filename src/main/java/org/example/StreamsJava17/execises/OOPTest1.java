package org.example.StreamsJava17.execises;

/**
 * @author Terrance Nyamfukudza
 * 21/3/2024
 */
public class OOPTest1 extends AA {
    String value = "awesome";
    public static void main(String[] args) {

        AA a = new OOPTest1();
        System.out.println(a.value);
        System.out.println(a.amazingMethod("lll"));
    }
    public String amazingMethod(String arg1){
        return arg1+"SUB";
    }
    public void amazingMethod(String arg1, String arg2){ }
}
class AA {
    String value = "amazing";
    String amazingMethod(String arg)
    {
        return arg +"SUPER";
    };

}
