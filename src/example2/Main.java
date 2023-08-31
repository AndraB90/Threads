package example2;

public class Main {
    public static void main(String[] args) {
        NewThread newThread = new NewThread();
        NewThread newThread1 = new NewThread();
        /*newThread.start();
        newThread1.start();

         */
        // Difference between run and start: start helps us to work in parallel (concurrency) and run works in sequence

        System.out.println("The name of the first Thread is: " + newThread.getName());
        System.out.println("The name of the second Thread is: " + newThread1.getName());
    }
}
