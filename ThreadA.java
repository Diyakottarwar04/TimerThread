class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}
//start internally calls internally method in a new thread
public class ThreadA {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();  // Create thread object
        t1.start(); // Start the thread
    }
}