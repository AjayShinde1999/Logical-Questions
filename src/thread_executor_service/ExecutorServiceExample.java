package thread_executor_service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        Runnable task = () -> {
            for (int i = 1; i < 100000; i++) {
                System.out.println(i + " : " + Thread.currentThread().getName());
            }
        };

        executorService.submit(task);
        executorService.submit(task);
        executorService.submit(task);

        executorService.shutdown();
    }
}
