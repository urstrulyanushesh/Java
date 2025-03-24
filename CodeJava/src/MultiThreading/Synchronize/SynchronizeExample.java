package MultiThreading.Synchronize;
class Counter{
    public int count=0;

    public synchronized void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }
}


class MyThread extends Thread{
    Counter ct;
    public MyThread(Counter ct) {
        this.ct = ct;
    }

    public void run(){
        for(int i=0;i<1000;i++){
            ct.increment();
        }
    }
}


public class SynchronizeExample {
    public static void main (String[] args)throws InterruptedException {
        Counter ctr=new Counter();
        MyThread t1=new MyThread(ctr);
        MyThread t2=new MyThread(ctr);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count::"+ctr.getCount());

}
}
