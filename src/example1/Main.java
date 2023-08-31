package example1;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        /*for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }

         */
        // Afiseaza cate Thread-uri sunt active in acest moment
        System.out.println("Numarul thread-urilor active: "+Thread.activeCount());
        Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
        for (var thread: threadSet) {
            System.out.println(thread+" este daemon: "+thread.isDaemon());
        }

        // Afiseaza numele Thread-ului activ
        System.out.println("Numele thread-ului activ este: "+Thread.currentThread().getName());

        //Schimba numele Thread-ului activ
        Thread.currentThread().setName("Mircea");
        System.out.println("Numele thread-ului activ este: "+Thread.currentThread().getName());

        //Afiseaza prioritatea Thread-ului principal
        System.out.println("Prioritatea Thread-ului "+Thread.currentThread().getName()+" este: "+Thread.currentThread().getPriority());

        //Schimba prioritatea Thread-uliu principal
        Thread.currentThread().setPriority(10);
        System.out.println("Prioritatea Thread-ului "+Thread.currentThread().getName()+" este: "+Thread.currentThread().getPriority());

        // Afiseaza daca Thread-ul current este activ
        System.out.println("Thread-ul "+Thread.currentThread().getName()+" este activ: "+Thread.currentThread().isAlive());


    }
}
