package org.example.concurrency;

/**
 * @author Terrance Nyamfukudza
 * 28/2/2024
 */
public class ObjectLockRule {
    private static int counter = 0;
    private static final Object lock = new Object();
    public static void main(String[] args) {

            // Thread A
            Thread threadA = new Thread(() -> {
                synchronized (lock) {
                    counter = 1; // Write operation within synchronized block
                }
            });

            // Thread B
            Thread threadB = new Thread(() -> {
                synchronized (lock) {
                    int value = counter; // Read operation within synchronized block
                    System.out.println("Thread B: " + value);
                }
            });

            threadA.start();
            threadB.start();
        }

}
