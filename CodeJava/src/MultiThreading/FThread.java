package MultiThreading;

public class FThread extends Thread {
    @Override
    public void run() {
    for(int i=0; i<=200; i++){
        System.out.println(i);
    }
        System.out.println(Thread.currentThread().getName()+"Completed F");
    }
}
