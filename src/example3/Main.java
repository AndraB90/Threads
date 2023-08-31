package example3;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5 ; i++) {
            CustomThread customThread = new CustomThread(i);
            // Pentru un Thread definit prin interfata Runnable mai trebuie facut un extra pas,
            // trebuie creat un alt Thread simplu care ia ca parametru Thread-ul custom
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
