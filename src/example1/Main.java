package example1;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        // Print how many Threads are active now
        System.out.println("Number of active Threads: " + Thread.activeCount());
        Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
        for (var thread : threadSet) {
            System.out.println(thread + " is daemon: " + thread.isDaemon());
        }

        // Print the name of active Thread
        System.out.println("Name of active Thread: " + Thread.currentThread().getName());

        // Change name of active Thread
        Thread.currentThread().setName("Mircea");
        System.out.println("Name of active Thread: " + Thread.currentThread().getName());

        // Show priority of main Thread
        System.out.println("Priority of Thread " + Thread.currentThread().getName() + " is: " + Thread.currentThread().getPriority());

        // Change priority of main Thread
        Thread.currentThread().setPriority(10);
        System.out.println("Priority of Thread " + Thread.currentThread().getName() + " is: " + Thread.currentThread().getPriority());

        // Show if current Thread is active
        System.out.println("Thread " + Thread.currentThread().getName() + " is activ: " + Thread.currentThread().isAlive());
    }
}
