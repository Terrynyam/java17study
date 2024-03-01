package org.example.concurrency;

import static java.lang.System.out;

/**
 * @author Terrance Nyamfukudza
 * 27/2/2024
 */
public class ThreadPriorities {
    public static void main(String[] args) {
        Thread myThread = new Thread(() ->
                out.println(Thread.currentThread() + ": Don't mess with my priority!"));

        out.println(myThread);
        out.println("---------------------");
        myThread.setPriority(Math.min(Thread.MAX_PRIORITY, myThread.getPriority() + 1));
        out.println(myThread);
                myThread.start();
    }
}
