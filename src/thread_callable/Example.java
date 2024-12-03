package thread_callable;

import java.util.concurrent.*;

public class Example {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

//        Runnable task = ()->{
//            return "Ajay Shinde"; // error run is void
//        };

        Callable<String> task = () -> "Hello World";

//      Future<String> future = executorService.submit(() -> "Ajay Shinde"); // submit method is taking callable
        Future<String> future = executorService.submit(task);

        System.out.println(future.get());

        if (future.isDone()) {
            System.out.println("task is done");
        }
    }
}
