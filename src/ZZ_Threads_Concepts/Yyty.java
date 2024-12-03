package ZZ_Threads_Concepts;

class PrintNumber {

    private int num = 1;
    private int limit = 10;

    public synchronized void printOdd() {
        while (num < limit) {
            if (num % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("odd : " + num);
            num++;
            notify();
        }
    }

    public synchronized void printEven() {
        while (num <= limit) {
            if (num % 2 != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Even : " + num);
            num++;
            notify();
        }

    }
}

public class Yyty {
    public static void main(String[] args) {
        PrintNumber printNumber = new PrintNumber();

        Runnable odd = () -> printNumber.printOdd();
        Runnable even = () -> printNumber.printEven();

        Thread t1 = new Thread(odd);
        Thread t2 = new Thread(even);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
