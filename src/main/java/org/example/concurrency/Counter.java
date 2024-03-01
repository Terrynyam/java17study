package org.example.concurrency;

/**
 * @author Terrance Nyamfukudza
 * 17/2/2024
 */
public class Counter implements Runnable{
    private int currentValue = 0;
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName(); // (2)
        while (currentValue < 5) {
            System.out.printf("%s: old:%s new:%s%n",
                    threadName, // (3) Print threa
                    this.currentValue, // old value,
                    ++this.currentValue); // new increme
            try {
                Thread.sleep(500); // (4) Current thr
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
            }
        }System.out.println("Exiting " + threadName);
    }
}
class Client {
    public static void main(String[] args) {
        String threadName = Thread.currentThread().getName(); // (5
        System.out.println("Method main() runs in thread " + threadName);
// Create a Counter object:
        Counter counter = new Counter();
// Create two threads with the same Counter: // (7
        Thread threadA = new Thread(counter, "Thread A");
        Thread threadB = new Thread(counter, "Thread B");
// Start the two threads: // (8
        System.out.println("Starting " + threadA.getName());
        threadA.start();
// threadA.start(); // (9) IllegalTh
        System.out.println("Starting " + threadB.getName());
        threadB.start();
        System.out.println("Exiting Thread " + threadName); // (1
    }
}