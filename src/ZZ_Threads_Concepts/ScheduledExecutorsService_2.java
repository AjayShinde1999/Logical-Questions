package ZZ_Threads_Concepts;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorsService_2 {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(3);

        Runnable task1 = () -> System.out.println("Task 1");
        Runnable task2 = () -> System.out.println("Task 2");
        Runnable task3 = () -> System.out.println("Task 3");

        service.schedule(task1, 2, TimeUnit.SECONDS);

        // initial delay is 4 second, After the task completes it will wait for 2 seconds
        service.scheduleWithFixedDelay(task3, 4, 2, TimeUnit.SECONDS);

        service.shutdown();
    }
}
