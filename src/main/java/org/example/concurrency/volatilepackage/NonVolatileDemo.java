package org.example.concurrency.volatilepackage;

/**
 * @author Terrance Nyamfukudza
 * 1/3/2024
 */
public class NonVolatileDemo {
    private static boolean stopThread = false;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 2; i++) { // (2)
            new Thread(() -> {
                while (!stopThread) { // (3)
                    System.out.println(Thread.currentThread().getName()
                            + ": Get me out of here!");
                }
            }, "T" + i).start();
        }
        Thread.sleep(1); // (4)
        stopThread = true; // (5
    }
}
