package thread_executors_invokeAll;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class InvokeAllExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Callable<Integer> task1 = ()->{
            System.out.println("Task 1");
            return 1;
        };

        Callable<Integer> task2 = ()->{
            System.out.println("Task 2");
            return 2;
        };

        Callable<Integer> task3 = ()->{
            System.out.println("Task 3");
            return 3;
        };

        List<Callable<Integer>> list = Arrays.asList(task1, task2, task3);

        List<Future<Integer>> futures = executorService.invokeAll(list);

         // Invoke all and wait for 1 second, regardless of task complete or not
//        List<Future<Integer>> futuress = executorService.invokeAll(list,1,TimeUnit.SECONDS);

        for(Future<Integer> f:futures){
            System.out.println(f.get());
        }

    }
}
