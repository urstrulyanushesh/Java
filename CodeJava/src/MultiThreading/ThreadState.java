package MultiThreading;


import java.lang.*;

class StThread extends Thread{
    public void run(){
try{
    Thread.sleep(2000);
    System.out.println("Thread State: "+getState());
    for (int i = 0; i < 10; i++) {
        System.out.println(i);
    }


} catch (Exception e) {
    throw new RuntimeException(e);
}
    }
}

public class ThreadState {
    public static void main(String[] args)throws Exception {
        StThread f1=new StThread();
        System.out.println("Thread State: "+f1.getState());
        f1.start();
        f1.join();
        System.out.println("Thread State:"+f1.getState());

    }
}

