package thread_life_cycle;

public class MyThread extends Thread{

    @Override
    public void run(){
        try {
            Thread.sleep(2000);
            System.out.println("my thread running");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        System.out.println(t1.getState()); // NEW
        t1.start();
        System.out.println(t1.getState()); // RUNNABLE // It is also like RUNNING also
        System.out.println(Thread.currentThread().getState()); // RUNNABLE (RUNNING) // bcoz there no RUNNING state in java
        Thread.sleep(1000);
        System.out.println(t1.getState()); // TIMED_WAITING
        t1.join(); // main method will wait until the completion of t1 thread.
        System.out.println(t1.getState()); // TERMINATED

    }
}
