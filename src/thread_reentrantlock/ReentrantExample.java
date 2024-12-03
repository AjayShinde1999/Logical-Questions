package thread_reentrantlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample {

    private final Lock lock = new ReentrantLock();

    public void outerMethod() {
        lock.lock(); // 1st lock
        try {
            System.out.println("Outer Method");
            innerMethod();
        } finally {
            lock.unlock(); // 1st lock released
        }

    }

    public void innerMethod() {
        lock.lock(); // 2nd lock
        try {
            System.out.println("Inner Method");
        } finally {
            lock.unlock(); // 2nd lock released
        }
    }

    public static void main(String[] args) {
        ReentrantExample reentrantExample = new ReentrantExample();
        Runnable runnable = () -> {
            reentrantExample.outerMethod();
        };
        Thread t1 = new Thread(runnable);
        t1.start();

        Thread t2 = new Thread(runnable);
        t2.start();
    }


}
