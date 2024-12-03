package thread_name;

public class MyThread extends Thread {

    // like this also we can set the Thread name
    public MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
//        Thread.currentThread().setName("Ajay-Thread");
        System.out.println(Thread.currentThread().getName());

    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread("Ajay-Thread");
//        t1.setName("Ajay-Thread"); // like this also we can set name
        t1.start();

        Thread.currentThread().setName("AJIT");
        System.out.println(Thread.currentThread().getName());
    }
}
