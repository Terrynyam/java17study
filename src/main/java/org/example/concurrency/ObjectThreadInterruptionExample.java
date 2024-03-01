package org.example.concurrency;

/**
 * @author Terrance Nyamfukudza
 * 28/2/2024
 */
public class ObjectThreadInterruptionExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println("Thread is running");
                    Thread.sleep(1000); // Simulate some work
                }
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        });

        thread.start(); // Start the new thread
        try {
            Thread.sleep(3000); // Allow some time for the thread to run
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt(); // Interrupt the new thread
    }
}
