package thread_locks;

public class Main {
    public static void main(String[] args) {
        BankAccount sbi = new BankAccount();

        Runnable task = ()->{
            sbi.withdraw(50);
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
    }
}
