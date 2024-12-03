package thread_daemon;

public class MyThread extends Thread{

    @Override
    public void run(){

        while (true){
            System.out.println("Running.......");
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setDaemon(true);
        t1.start();
        System.out.println("Main Done");
       // Jvm will wait for daemon thread to complete, it will stop the program
    }
}
