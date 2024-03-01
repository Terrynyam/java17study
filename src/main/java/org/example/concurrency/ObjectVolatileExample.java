package org.example.concurrency;

/**
 * @author Terrance Nyamfukudza
 * 28/2/2024
 */
public class ObjectVolatileExample {
    private static volatile boolean flag = false;
    public static void main(String[] args) {

            // Thread A
            Thread threadA = new Thread(() -> {
                flag = true; // Write operation to volatile variable
            });

            // Thread B
            Thread threadB = new Thread(() -> {
                while (!flag) {
                    // Busy-wait until flag becomes true
                }
                System.out.println("Thread B: Flag is now true");
            });

            threadA.start();
            threadB.start();
        }

}
