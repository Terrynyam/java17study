package org.example.StreamsJava17.execises;

/**
 * @author Terrance Nyamfukudza
 * 18/3/2024
 */
public class SwitchTest {
    public static void main(String[] args) {
        int value = 0;

        switch(value)  //1
        {
            case 0 :
                boolean b = false; //2
                System.out.println(b);
                break;
            case 1 :
                b = true; // 3
                System.out.println(b);
                break;
        }
       // if(b) System.out.println(args[2]); //4

        //----------------------------------------------------------------

        int values = 2;
        switch (values) {
            case 1:
                int x = 10;
                System.out.println(x); // x is available here
                break;
            case 2:
                x = 20;
                System.out.println(x);
                // x is not available here
                break;
            default:
                // x is not available here
                break;
        }
        //----------------------------------------------------------------------

    }
    public String switchMethod(){
        final int x = 1;
        return switch(x){
            case 0 -> "new Car()";
            default -> "Ola";
        };
    }
}
