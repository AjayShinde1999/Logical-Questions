package thread_executor;

import java.util.concurrent.Executor;

public class ExecutorExample {
    public static void main(String[] args) {

        Executor executor = new Executor() {
            @Override
            public void execute(Runnable command) {
                Thread t = new Thread(command);
                t.start();
            }
        };

        Runnable r = ()-> System.out.println("hello");
        executor.execute(r);

    }
}
