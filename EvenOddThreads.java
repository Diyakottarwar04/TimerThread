public class EvenOddThreads {
    public static void main(String[] args) {
        Thread even = new Thread(() -> {
            for (int i = 2; i <= 10; i += 2)
                System.out.println("Even: " + i);
        });

        Thread odd = new Thread(() -> {
            for (int i = 1; i < 10; i += 2)
                System.out.println("Odd: " + i);
        });
        
        even.start();
        odd.start();
    }
}