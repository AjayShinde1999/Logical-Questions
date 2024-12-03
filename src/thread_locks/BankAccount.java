package thread_locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private int balance = 100;
    private Lock lock = new ReentrantLock();

    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " Attempting to withdraw " + amount);
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {
                    System.out.println(Thread.currentThread().getName() + " Collect the amount " + amount);
                    balance = balance - amount;
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                    } finally {
                        lock.unlock();
                    }
                    System.out.println(Thread.currentThread().getName() + " Complete withdraw Remaining balance " + balance);
                } else {
                    System.out.println(Thread.currentThread().getName() + " Insufficient funds " + balance);
                }
            } else {
                System.out.println("Could not acquire the lock, will try later");
            }
        } catch (InterruptedException e) {
        }
    }
}
