package org.example.concurrency;

/**
 * @author Terrance Nyamfukudza
 * 18/2/2024
 */
public class NormalThreads {
    public static void pause() { // Defines the thread task
        try {
            Thread.sleep(10_000); // Wait for 10 seconds
            } catch (InterruptedException e) {}
        System.out.println("Thread finished!");
        }
    public static void main(String[] args) {
        var job = new Thread(() -> pause()); // Create thread

        job.start(); // Start thread
        System.out.println("Main method finished!");
        // wait for 10 seconds while executing thread job even after the main thread has finished
        //executing will wait for the thread job to finish executing
    }
}
