package ZZ_Threads_Concepts;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Account {
    private int balance = 100;
    private Lock lock = new ReentrantLock();

    public void withdraw(int amount) {
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (amount <= balance) {
                    System.out.println("Collect the amount : " + amount);
                    balance = balance - amount;
                    System.out.println("Remaining balance : " + balance);
                    try{
                        Thread.sleep(2000);
                    } catch (Exception e){
                        System.out.println(e);
                    }
                    lock.unlock();
                } else {
                    System.out.println("Insufficient funds : " + balance);
                }
            } else {
                System.out.println("Unable to acquire the lock, try later");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class TryLockExample {
    public static void main(String[] args) {
        Account sbi = new Account();

        Runnable task = () -> sbi.withdraw(50);

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);

        t1.start();
        t2.start();
        t3.start();

    }
}
