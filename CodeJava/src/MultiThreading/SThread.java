package MultiThreading;

public class SThread extends Thread{
    public void run() {
        for(int i=300; i<=400; i++) {
            if (i % 11 == 0) {
                System.out.println(i);
            }
        }
        System.out.println(Thread.currentThread().getName()+"Completed S");
    }
}
