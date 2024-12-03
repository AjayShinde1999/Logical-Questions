package ZZ_Threads_Concepts;

import java.util.concurrent.*;

public class ExecutorServiceExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(4);

        Runnable task = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(i + " : " + Thread.currentThread().getName());
            }
        };

        Callable<String> callable = ()-> "Ajay Shinde";

        service.submit(task);
        service.submit(task);

        // Passing Callable which as return type;
        Future<String> submit = service.submit(callable);
        System.out.println(submit.get());

        service.shutdown();
    }
}
