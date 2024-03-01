package org.example.concurrency;

/**
 * @author Terrance Nyamfukudza
 * 18/2/2024
 */
public class DaemonThreads {
    public static void pause() { // Defines the thread task
        try {
            Thread.sleep(10_000); // Wait for 10 seconds
        } catch (InterruptedException e) {}
        System.out.println("Thread finished!");
    }
    public static void main(String[] args) {
        var job = new Thread(() -> pause()); // Create thread

        job.setDaemon(true);
        job.start(); // Start thread
        System.out.println("Main method finished!");
        //after running the main thread it will exit and not wait
        // for job thread to finish executing

    }
}
