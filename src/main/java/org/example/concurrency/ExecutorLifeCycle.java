package org.example.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/**
 * @author Terrance Nyamfukudza
 * 29/2/2024
 */
public class ExecutorLifeCycle {
    // Task: dice roll.
    private static final Runnable diceRoll = () -> {
        int diceValue = ThreadLocalRandom.current().nextInt(1, 7);
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " => dice value: " + diceValue);
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            System.out.println(threadName + ": " + e);
        }
    };

    public static void main(String[] args) {
        System.out.printf("%50s %s%n", "isShutdown()", "isTerminated()");
// Create the executor service:
                ExecutorService es = Executors.newFixedThreadPool(3);
        try {
            checkStates(es, "Before execute() at (4): ");
// Submit tasks:
            es.execute(diceRoll);
            es.execute(diceRoll);
            es.execute(diceRoll);
            checkStates(es, "After execute() at (4): ");
        } finally {
// Shut down the executor service:
            checkStates(es, "Before shutdown() at (6a): ");
            es.shutdown();
            checkStates(es, "After shutdown() at (6a): ");
// checkStates(es, "Before shutdownNow() at (6b): ");
// es.shutdownNow();
// checkStates(es, "After shutdownNow() at (6b): ");
        } // Second phase of shutdown:
// awaitAndShutdownNow(es, 2, TimeUnit.SECONDS);
// awaitAndShutdownNow(es, 1, TimeUnit.MILLISECONDS);
    } private static void checkStates(ExecutorService es, String msg    ) {
        System.out.printf("%-40s %-5s %-5s%n", msg, es.isShutdown(), es.isTerminated());
    }
    private static void awaitAndShutdownNow(
            ExecutorService es, int timeout, TimeUnit timeunit) {
        try {
// Timed wait for tasks to complete execution:
            if (!es.awaitTermination(timeout, timeunit)) {
// Attempt to cancel any uncompleted and waiting tasks:
                checkStates(es, "Before shutdownNow() at (11): " );
                es.shutdownNow();
                checkStates(es, "After shutdownNow() at (11): " );
// Timed wait for tasks to be cancelled:
                while (!es.awaitTermination(timeout, timeunit)) {
                    System.out.println("All tasks not yet completed at (12): " );
                }
            } checkStates(es, "After awaitTermination() at (10): " );
        } catch (InterruptedException ie) {
// Attempt to cancel any uncompleted and waiting tasks:
            es.shutdownNow();
// Reinstate the interrupt status.
            Thread.currentThread().interrupt();
            checkStates(es, "After interruption: ");
        }
    }
}
