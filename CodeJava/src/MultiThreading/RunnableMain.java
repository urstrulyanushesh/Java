package MultiThreading;

class RunnableThread implements Runnable {
    @Override
    public void run() {
        for(int i=111; i<=1422; i++) {
            if ( i%11 == 0) {
                System.out.println(i + "M");
            }
        }
        System.out.println(Thread.currentThread().getName()+"Completed RunThread");
    }
}

class RunnableSec implements Runnable {
    @Override
    public void run() {
        for(int i=1; i<=5000; i++) {
                System.out.println(i);
        }
        System.out.println(Thread.currentThread().getName()+"Completed RunSec");
    }
}

public class RunnableMain {
    public static void main(String[] args) {
        RunnableThread r1 = new RunnableThread();
        RunnableSec r2 = new RunnableSec();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
        System.out.println("Finished");
    }
}

