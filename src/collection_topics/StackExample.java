package collection_topics;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Display the top element without removing it
        System.out.println("Top element (peek): " + stack.peek());  // Output: 30

        // Pop elements from the stack
        System.out.println("Popped element: " + stack.pop());  // Output: 30
        System.out.println("Popped element: " + stack.pop());  // Output: 20

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());  // Output: false

        // Search for an element in the stack
        System.out.println("Position of 10 in stack: " + stack.search(10));  // Output: 1
    }
}

