package org.example.concurrency.coderace;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * @author Terrance Nyamfukudza
 * 1/3/2024
 */
public class TestCounters {
    private static final int NUM_OF_INCREMENTS = 1000;
    private static final int POOL_SIZE = 10;

    public static void main(String[] args) {
        UnsafeCounter usc = new UnsafeCounter();
        runIncrementor(usc);
        System.out.printf("Unsafe Counter: %24d%n", usc.getValue());
        VolatileCounter vc = new VolatileCounter();
        runIncrementor(vc);
        System.out.printf("Volatile Counter: %22d%n", vc.getValue());
        SynchronizedCounter sc = new SynchronizedCounter();
        runIncrementor(sc);
        System.out.printf("Synchronized Counter: %18d%n", sc.getValue());
        AtomicCounter ac = new AtomicCounter();
        runIncrementor(ac);
        System.out.printf("Atomic Counter: %24d%n", ac.getValue());
        ReentrantLockCounter rlc = new ReentrantLockCounter();
        runIncrementor(rlc);
        System.out.printf("Reentrant Lock Counter: %16d%n", rlc.getValue());
//                ReentrantRWLockCounter rwlc = new ReentrantRWLockCounter();
//        runIncrementor(rwlc);
//        System.out.printf("Reentrant Read-Write Lock Counter: %d%n",rwlc.getValue());
    } public static void runIncrementor(ICounter counter) {
// A Runnable incrementor to call the increment() method of
// a fixed number of times:
        Runnable incrementor = () -> {
            IntStream.rangeClosed(1, NUM_OF_INCREMENTS).forEach(i-> counter.increment());
        };
// An executor service to manage a fixed number of increment
        ExecutorService execService = Executors.newFixedThreadPool(POOL_SIZE);
// Submit the incrementor to the executor service. Each thre
// the same incrementor, and thereby increments the same cou
        try {
            IntStream.range(0, POOL_SIZE).forEach(i -> execService.submit(incrementor));
        } finally {
            execService.shutdown();
        }// Wait for all tasks to complete.
        try {
            while (!execService.awaitTermination(1, TimeUnit.SECONDS));
        } catch (InterruptedException e) {
            execService.shutdownNow();
        }

    }
}
class UnsafeCounter implements ICounter {
    private int counter = 0;
    @Override public int getValue() { return counter; }
    @Override public void increment() { ++counter; }
}
class VolatileCounter implements ICounter {
    private volatile int counter = 0;
    @Override public int getValue() { return counter; }
    @Override public void increment() { ++counter; }
}

class AtomicCounter implements ICounter {
    private AtomicInteger counter = new AtomicInteger(0);

    @Override
    public int getValue() {
        return counter.get();
    }

    @Override
    public void increment() {
        counter.incrementAndGet();
    }
}
class SynchronizedCounter implements ICounter {
    private int counter = 0;
    @Override public synchronized int getValue() { return counter;}
    @Override public synchronized void increment() { counter++; }
    }
class ReentrantLockCounter implements ICounter {
    private Lock rl = new ReentrantLock();
    private int counter = 0;

    @Override
    public int getValue() {
        rl.lock();
        try {
            return counter;
        } finally {
            rl.unlock();
        }
    }
    @
            Override
    public void increment() {
        rl.lock();
        try {
            counter++;
            getValue();
        } finally { rl.unlock(); }
    }
}