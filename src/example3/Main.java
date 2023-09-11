package example3;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5 ; i++) {
            CustomThread customThread = new CustomThread(i);
            // For a Thread defined through the Runnable interface, an extra step must be taken,
            // another simple Thread must be created that takes the custom Thread as a parameter
            Thread thread = new Thread(customThread);
            thread.start();
            System.out.println("Prioritatea este: "+thread.getPriority());
            /*try {
                thread.join();
            } catch (InterruptedException e) {

            }
             */

            if(i == 3){
                throw new RuntimeException();
            }
        }
    }
}
