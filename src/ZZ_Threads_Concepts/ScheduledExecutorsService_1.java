package ZZ_Threads_Concepts;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorsService_1 {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(3);

        Runnable task1 = ()-> System.out.println("Task 1");
        Runnable task2 = ()-> System.out.println("Task 2");
        Runnable task3 = ()-> System.out.println("Task 3");

        service.schedule(task1, 2, TimeUnit.SECONDS);

        // initial delay is 4 second, the task completes or not  it will wait for 4 seconds only,
        // then again thread will execute.
        service.scheduleAtFixedRate(task2,5, 4, TimeUnit.SECONDS);

        service.shutdown();
    }
}
