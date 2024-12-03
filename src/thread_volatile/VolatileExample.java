package thread_volatile;

public class VolatileExample extends Thread {
    private volatile boolean running = true;  // Declaring the flag as volatile

    public void run() {
        while (running) {
            System.out.println("Thread is running...");
        }
        System.out.println("Thread stopped.");
    }

    public void stopRunning() {
        running = false;  // This change will be visible to the other thread immediately
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileExample example = new VolatileExample();
        example.start();

        Thread.sleep(1000);  // Let the thread run for 1 second
        System.out.println("Requesting to stop the thread.");
        example.stopRunning();
    }
}
