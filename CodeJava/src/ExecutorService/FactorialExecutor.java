package ExecutorService;



import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

class Calculator implements Callable<Integer> {
    private final int num;

    public Calculator(int num) {
        this.num = num;
    }

    @Override
    public Integer call() throws InterruptedException {
         Thread.sleep(3000);

        if (num <= 1) {
            return 1;
        }

        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}

public class FactorialExecutor {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        List<Future<Integer>> val = new ArrayList<>();

        try {
            for (int i = 0; i < 10; i++) {
                Calculator obj = new Calculator(i);
                val.add(es.submit(obj));
            }
            for (Future<Integer> disp : val) {
                try {
                    System.out.println("Result: " + disp.get());
                } catch (ExecutionException e) {
                    System.err.println("Task failed: " + e.getCause());
                }
            }

            es.shutdown(); // Initiate shutdown
            if (!es.awaitTermination(1, TimeUnit.SECONDS)) {
                System.out.println("Forced Shutdown");
                es.shutdownNow();
            }
        } catch (InterruptedException e) {
            System.err.println("Main thread interrupted: " + e.getMessage());
            es.shutdownNow();
        }
    }
}
