package thread_scheduled_executor_service;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceExample {
    public static void main(String[] args) {

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(4);

        Runnable task1 = () -> System.out.println("task 1 executed at: " + System.currentTimeMillis());

        Runnable task2 = () -> System.out.println("task 2 executed at: " + System.currentTimeMillis());

        Runnable task3 = () -> System.out.println("task 3 executed at: " + System.currentTimeMillis());

        Runnable task4 = () -> {
            System.out.println("task 4 executed at: " + System.currentTimeMillis());
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
            }
        };

        // Scheduling task1 to run after a 3 seconds delay
        scheduler.schedule(task1, 3, TimeUnit.SECONDS);

        // Scheduling task1 to run after a 2 seconds delay
        scheduler.schedule(task2, 2, TimeUnit.SECONDS);

        // Scheduling task3 to run periodically every 4 seconds with an initial delay of 5 seconds
        // task complete or not, after 4 seconds it will execute.
        scheduler.scheduleAtFixedRate(task4, 5, 4, TimeUnit.SECONDS);

        // fixed delay of 5 seconds after each execution, initial delay of 2 seconds
        // task completes 5 seconds delay.
        scheduler.scheduleWithFixedDelay(task4, 2, 5, TimeUnit.SECONDS);
    }
}
