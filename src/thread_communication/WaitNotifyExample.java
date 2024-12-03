package thread_communication;

class Data {
    private int value;
    private boolean hasData;

    public synchronized int consume() {
        while (!hasData){
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        hasData = false;
        notify();
        return value;
    }

    public synchronized void produce(int value) {
        while (hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        this.value = value;
        hasData = true;
        notify();
    }
}

class Producer extends Thread {
    private Data data;

    public Producer(Data data) {
        this.data = data;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            data.produce(i);
            System.out.println("Produced : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

class Consumer extends Thread {
    private Data data;

    public Consumer(Data data) {
        this.data = data;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            int value = data.consume();
            System.out.println("Consumed : " + value);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) {
        Data data = new Data();
        Producer producer = new Producer(data);
        Consumer consumer = new Consumer(data);

        producer.start();
        consumer.start();

    }
}
