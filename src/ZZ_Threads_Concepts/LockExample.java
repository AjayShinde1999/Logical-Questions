package ZZ_Threads_Concepts;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount {

    private int balance = 100;
    private Lock lock = new ReentrantLock();

    public void withdraw(int amount) {
        lock.lock();
        if (amount <= balance) {
            System.out.println("Collect the amount : " + amount);
            balance = balance - amount;
            System.out.println("Remaining balance : " + balance);
            lock.unlock();
        } else {
            System.out.println("Insufficient balance : " + balance);
        }
    }
}

public class LockExample {
    public static void main(String[] args) {
        BankAccount sbi = new BankAccount();

        Runnable task = () -> sbi.withdraw(50);

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);

        t1.start();
        t2.start();
        t3.start();

    }
}
