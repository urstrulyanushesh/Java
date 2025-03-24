package MultiThreading;

public class Main extends Thread{
    public static void main(String[] args) {
        FThread f1=new FThread();
        SThread s1=new SThread();
        System.out.println("\n First T Started");
        f1.start();
        System.out.println("\n Second T Started");
        s1.start();
    }
}
