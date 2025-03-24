package ExecutorService;
import java.lang.*;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Service implements Runnable{
    int i;

    public Service(int i) {
        this.i = i;
    }

    @Override
    public void run() {
            System.out.println(i);
            try{
                Thread.sleep(5000);

            } catch (Exception e) {
                e.getStackTrace();
            }
    }
}

public class ExecutorUtility {
    public static void main(String[] args) throws InterruptedException{
        ExecutorService es= Executors.newFixedThreadPool(5);
        System.out.println(new Date());
        for (int i = 0; i < 25; i++) {
            es.execute(new Service(i));
        }
//        es.shutdown();
        if(!es.awaitTermination(15, TimeUnit.SECONDS)){
            es.shutdownNow();
        System.out.println(new Date());
        }

    }
}