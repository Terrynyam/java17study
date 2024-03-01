package org.example.concurrency;

/**
 * @author Terrance Nyamfukudza
 * 28/2/2024
 */
public class ObjectThreadTerminationRule {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("Thread is running");
        });

        thread.start(); // Start the new thread
        thread.join(); // Wait for the new thread to finish
        System.out.println("Main thread: Thread has terminated");
    }
   /** The main thread creates a new thread thread and starts its execution.
       - The main thread then waits for the new thread to finish its execution by calling thread.join().
       - According to the Thread Termination Rule, any actions performed by the new thread (e.g., printing "Thread
        is running") must happen-before the main thread can detect that the new thread has terminated.
       - After the new thread finishes its execution and terminates, the main thread proceeds to print "Main thread:
        Thread has terminated".
    */
}
