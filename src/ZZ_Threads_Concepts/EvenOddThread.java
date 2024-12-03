package ZZ_Threads_Concepts;

class NumberGenerator {
    private int number = 1;  // Start with 1
    private final int LIMIT = 10;  // Generate numbers up to this limit

    // Method for printing odd numbers
    public synchronized void printOdd() {
        while (number < LIMIT) {
            if (number % 2 == 0) {  // If number is even, wait for the even thread to notify
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Odd: " + number);
            number++;
            notify();  // Notify the even thread to take over
        }
    }

    // Method for printing even numbers
    public synchronized void printEven() {
        while (number <= LIMIT) {
            if (number % 2 != 0) {  // If number is odd, wait for the odd thread to notify
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Even: " + number);
            number++;
            notify();  // Notify the odd thread to take over
        }
    }
}

public class EvenOddThread {
    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator();

        //Create threads for generating odd and even numbers
        //method reference generator::printOdd simplifies the code by directly passing the method as a Runnable.
//        Thread oddThread = new Thread(generator::printOdd);
//        Thread evenThread = new Thread(generator::printEven);

        Runnable odd = ()-> generator.printOdd();
        Runnable even = ()-> generator.printEven();


        Thread oddThread = new Thread(odd);
        Thread evenThread = new Thread(even);

        // Start both threads
        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All numbers printed.");
    }
}

