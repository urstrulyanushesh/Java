package MultiThreading;

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(500); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class JoinExample {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.setName("Atom");
        thread2.setName("Bomb");

        thread1.start(); // Start thread1
        thread2.start(); // Start thread2

        try {
            thread1.join(); // Wait for thread1 to finish
            thread2.join(); // Wait for thread2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // This line will only execute after both threads have completed
        System.out.println("Both threads have finished execution.");
    }
}

