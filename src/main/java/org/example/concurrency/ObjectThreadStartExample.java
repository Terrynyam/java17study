package org.example.concurrency;

/**
 * @author Terrance Nyamfukudza
 * 28/2/2024
 */
public class ObjectThreadStartExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("New thread is running");
        });

        thread.start(); // Start the new thread
        System.out.println("Main thread has started the new thread");
    }
}
