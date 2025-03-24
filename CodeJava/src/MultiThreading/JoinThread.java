package MultiThreading;

import java.lang.*;

class Goal extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello "+i +" From "+currentThread().getName());
        }
    }
}
public class JoinThread {
    public static void main(String[] args)throws InterruptedException {
        Goal g1=new Goal();
        Goal g2=new Goal();
        Goal g3=new Goal();
        g1.start();
        System.out.println("Thread 0 Started");
        g1.join();
        System.out.println("Thread 0 Ended");
        g2.start();
        System.out.println("Thread 1 Started");
        g2.join();
        System.out.println("Thread 1 Ended");
        g3.start();
        System.out.println("Thread 2 Started");
        g3.join();
        System.out.println("Thread 2 Ended ");
    }
}
