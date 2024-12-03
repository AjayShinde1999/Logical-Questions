package ZZ_Threads_Concepts;

class Counter {
    synchronized void count() {
        for (int i = 0; i < 100; i++) {
            System.out.print(i+" ");
        }
        System.out.println("---------------------------------------------");
    }
}


public class SynchronizedExample {
    public static void main(String[] args) {

        Counter counter = new Counter();

        Runnable task = () -> counter.count();

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("All Thread Executed");

    }
}
