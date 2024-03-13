package org.example.concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author Terrance Nyamfukudza
 * 1/3/2024
 */
public class CyclicBarrierClass {
    public static final int PARTIES = 3;
    public static void main(String[] args) {
        Runnable barrierAction = () ->
                System.out.println("Barrier action by "
                        + Thread.currentThread().getName()
                        + ": All tasks are released.");

        CyclicBarrier barrier = new CyclicBarrier(PARTIES, barrierAction);
        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            try {
                System.out.println(threadName + " is now waiting");
                barrier.await();
                System.out.println(threadName + " is now released");
            } catch (BrokenBarrierException | InterruptedException e) {
                e.printStackTrace();
            }
        };
        for (int i = 0; i < PARTIES; i++) {
            new Thread(task, "T" + (i + 1)).start();
        }

    }
}
