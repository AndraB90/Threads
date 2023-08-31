package example2;

public class Main {
    public static void main(String[] args) {
        NewThread newThread = new NewThread();
        NewThread newThread1 = new NewThread();
        /*newThread.start();
        newThread1.start();

         */
        // Diferenta intre run si start: start ne ajuta sa rulam in paralel (concurrency) iar run ruleaza secvential

        System.out.println("Numele primului Thread este: "+newThread.getName());
        System.out.println("Numele la al doilea Thread este: "+newThread1.getName());
    }
}
