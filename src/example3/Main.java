package example3;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            CustomThread customThread = new CustomThread(i);
            // For a Thread defined by the Runnable Interface you need to make an extra step,
            // you need to create a simple Thread, which takes as parameter a custom Thread
            Thread thread = new Thread(customThread);
            thread.start();
            System.out.println("The Priority is: " + thread.getPriority());
            /*try {
                thread.join();
            } catch (InterruptedException e) {

            }

             */

            if (i == 3) {
                throw new RuntimeException();
            }
        }
    }
}
