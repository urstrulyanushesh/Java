package ExecutorService;

import java.util.concurrent.*;

class FetchName implements Callable<String> {
    private final String name;

    public FetchName(String name) {
        this.name = name;
    }

    public String call()throws Exception{
        System.out.println("Getting Name From Server: "+name);
        Thread.sleep(5000);
        return name+ " Gg";

    }
}

public class FutureClass {
    public static void main(String[] args)throws InterruptedException, ExecutionException {
        ExecutorService es= Executors.newFixedThreadPool(2);
        FetchName obj1=new FetchName("A");
        FetchName obj2=new FetchName("Ab");
        FetchName obj3=new FetchName("Abh");
        FetchName obj4=new FetchName("Abhi");


        Future<String> get1=es.submit(obj1);
        Future<String> get2=es.submit(obj2);
        Future<String> get3=es.submit(obj3);
        Future<String> get4=es.submit(obj4);


        System.out.println("Pura Naam----"+get1.get());
        System.out.println("Pura Naam----"+get2.get());
        System.out.println("Pura Naam----"+get3.get());
        System.out.println("Pura Naam----"+get4.get());

        es.shutdownNow();

    }
}
