package ZZ_Threads_Concepts;

class MyThread extends Thread {

    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("run-method");
            Thread.yield();
        }
    }
}

public class YieldExample {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        for(int i=0; i<10; i++){
            System.out.println("Main Thread");
        }

    }
}
