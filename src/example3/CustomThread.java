package example3;

public class CustomThread implements Runnable{

    int threadNumber;

    public CustomThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <=5 ; i++) {
            System.out.println("Thread "+threadNumber+" shows number "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
}
