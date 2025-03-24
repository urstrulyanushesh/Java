package MultiThreading;


import java.lang.*;

class FirstThread extends Thread{
    public void run(){

        for (int i = 0; i < 5; i++) {
            System.out.println(i+" Hello From Thread "+currentThread().getName());
        }
    }
}

public class TwoThread {
    public static void main(String[] args) {
        FirstThread f1=new FirstThread();
        f1.setName("FT");
        FirstThread f2=new FirstThread();
        f2.setName("ST");
        f1.start();
        f2.start();

    }
}
