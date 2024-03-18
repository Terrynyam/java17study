package org.example.StreamsJava17;

/**
 * @author Terrance Nyamfukudza
 * 16/3/2024
 */
public class TryTest {
    public static void main(String[] args) {
        int i = 0;
        loop :         // 1
        {
            System.out.println("Loop Lable line");
            try {
                for (; true; i++) {
                    if (i > 5) break loop;       // 2
                    System.out.println(i);
                }
            } catch (Exception e) {
                System.out.println("Exception in loop.");
            } finally {
                System.out.println("In Finally");      // 3
            }
        }
    }
}
