package collection_topics;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");

        // View the head of the queue
        System.out.println("Head of the queue (peek): " + queue.peek());  // Output: Alice

        // Remove elements from the queue
        System.out.println("Removed: " + queue.remove());  // Output: Alice
        System.out.println("Removed: " + queue.poll());    // Output: Bob

        // Check if queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());  // Output: false
    }
}

