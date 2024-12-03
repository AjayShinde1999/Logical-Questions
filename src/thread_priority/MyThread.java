package thread_priority;

public class MyThread extends Thread{

    public MyThread(String name){
        super(name);
    }

    @Override
    public void run(){
        for(int i=0; i<=5; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        MyThread l = new MyThread("Low Priority Thread");
        l.setPriority(MIN_PRIORITY);
        MyThread m = new MyThread("Medium Priority Thread");
        m.setPriority(NORM_PRIORITY);
        MyThread h = new MyThread("High Priority Thread");
        h.setPriority(MAX_PRIORITY);


        // There is no guarantee that high priority will execute first.
        m.start();
        h.start();
        l.start();

    }
}
