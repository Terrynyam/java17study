package org.example.concurrency;

/**
 * @author Terrance Nyamfukudza
 * 28/2/2024
 */
public class StarvationClass {
    public static void main(String[] args) {
            Hole hole = new Hole();
            for (int i = 0; i < 5; i++) {
                new Thread(() -> hole.dig()).start();
            }

    }
}
class Hole {
    public synchronized void dig() {
        String threadName = Thread.currentThread().getName();
        while (true) {
            System.out.println(threadName + " digging the hole.");
            // try {
// wait(1);
// } catch (InterruptedException ex) {
// ex.printStackTrace();
// }
        }
    }
}
