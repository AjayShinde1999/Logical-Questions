package thread_interrupt;

public class MyThread extends Thread{

    @Override
    public void run(){
        try {
            Thread.sleep(2000);
            System.out.println("thread is running...."); // it will not execute
        } catch (InterruptedException e) {
            System.out.println("Thread is interrupted");
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        t1.interrupt();
    }
}
