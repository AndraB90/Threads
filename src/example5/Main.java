package example5;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Defineste 2 Thread-uri custom in cele doua moduri diferite
        // Primul va afisa numerele de la 1 la 10
        // 2-lea de la 10 la 1
        //Ruleazale in parallel apoi ruleazale sincronizat

        // Parallel
        NewThread1 newThread1 = new NewThread1();
        NewThread2 newThread2 = new NewThread2();
        /*Thread thread = new Thread(newThread2);
        newThread1.setPriority(10);
        thread.setPriority(10);
        Thread.currentThread().setPriority(1);
        newThread1.start();
        thread.start();

         */


        // Secvential

        newThread1.run();
        newThread2.run();

        Thread.sleep(12000);

        System.out.println("--------------------------------");


    }
}
