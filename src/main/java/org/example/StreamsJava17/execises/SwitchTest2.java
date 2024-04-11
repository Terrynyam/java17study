package org.example.StreamsJava17.execises;

/**
 * @author Terrance Nyamfukudza
 * 10/4/2024
 */
public class SwitchTest2 {
    public static void main(String[] args) {
        int i = 5;
        switch (i){
            default:
                System.out.println("default");
            case 1:
                System.out.println(1);
            case 0:
                System.out.println(0);
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
        }

    }
}
