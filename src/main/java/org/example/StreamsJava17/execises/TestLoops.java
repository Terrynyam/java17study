package org.example.StreamsJava17.execises;

/**
 * @author Terrance Nyamfukudza
 * 29/3/2024
 */
public class TestLoops {
    public static void main(String[] args) {
        char i;
        LOOP:
        for (i = 0; i < 5; i++) {
            switch (i++) {
                case '0':
                    System.out.println("A");
                case 1:
                    System.out.println("B");
                    break LOOP;
                case 2:
                    System.out.println("C");
                    break;
                case 3:
                    System.out.println("D");
                    break;
                case 4:
                    System.out.println("E");
                case 'E':
                    System.out.println("F");
            }
        }
    }
}
