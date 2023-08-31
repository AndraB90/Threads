package example5;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Define two custom Threads (using two different approaches)
        // First will print the numbers between 1 and 10
        // The second will print the numbers between 10 and 1
        // Run them firstly in parallel manner then in sequence

        // Parallel / Concurrency
        NewThread1 newThread1 = new NewThread1();
        NewThread2 newThread2 = new NewThread2();
        /*Thread thread = new Thread(newThread2);
        newThread1.setPriority(10);
        thread.setPriority(10);
        Thread.currentThread().setPriority(1);
        newThread1.start();
        thread.start();

         */


        // In Sequence

        newThread1.run();
        newThread2.run();

        Thread.sleep(12000);

        System.out.println("--------------------------------");


    }
}
