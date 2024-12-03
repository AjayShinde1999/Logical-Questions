package thread_synchronized;

public class Counter {

    private int counter;

    public synchronized void increment(){
        counter++;
    }

    public int getCounter(){
        return counter;
    }
}
