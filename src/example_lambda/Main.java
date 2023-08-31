package example_lambda;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1");
            while (true) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
            }
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2");
            while (true) {
                System.out.println("World");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
            }
        });

        thread1.start();
        /*try {
            thread1.join();
        } catch (InterruptedException e) {

        }

         */

        thread2.start();

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {

        }


        //thread1.stop(); // this worked for me, even if it is deprecated
        thread2.interrupt(); // this not
    }
}
