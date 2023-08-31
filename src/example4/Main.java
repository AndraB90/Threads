package example4;

public class Main {
    public static void main(String[] args) {
        /*
        System.out.println("Hello");
        System.out.println(2/0);
        System.out.println("World");

         */

        for (int i = 1; i < 5; i++) {
            System.out.println(i);
            if(i == 3){
                throw new RuntimeException();
            }
        }
    }
}
