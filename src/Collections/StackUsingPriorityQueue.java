package Collections;

import java.util.PriorityQueue;
import java.util.Comparator;
 
class StackUsingPriorityQueue {
    // Priority Queue with custom comparator to mimic stack behavior (LIFO)
    private PriorityQueue<Integer> pq;
 
    public StackUsingPriorityQueue() {
        // Custom comparator to reverse the natural order
        pq = new PriorityQueue<>(Comparator.reverseOrder());
    }
 
    // Push method to add an element to the stack
    public void push(int element) {
        pq.add(element);
    }
 
    // Pop method to remove the top element from the stack
    public int pop() {
        if (pq.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return pq.poll(); // Removes and returns the highest priority element (top of the stack)
    }
 
    // Peek method to get the top element without removing it
    public int peek() {
        if (pq.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return pq.peek(); // Returns the highest priority element without removing it
    }
 
    // Method to check if the stack is empty
    public boolean isEmpty() {
        return pq.isEmpty();
    }
 
    public static void main(String[] args) {
        // Create an instance of the stack
        StackUsingPriorityQueue stack = new StackUsingPriorityQueue();
 
        // Push elements onto the stack
        stack.push(5);
        stack.push(10);
        stack.push(7);
        stack.push(2);
 
        // Print the current top element using peek
        System.out.println("Top element (peek): " + stack.peek()); // Should print 2 (LIFO order)
 
        // Pop elements from the stack
        System.out.println("Popped element: " + stack.pop()); // Should print 2 (LIFO order)
        System.out.println("Popped element: " + stack.pop()); // Should print 7
 
        // Check the top element after popping
        System.out.println("Top element (peek) after pop: " + stack.peek()); // Should print 10
 
        // Pop the remaining elements
        System.out.println("Popped element: " + stack.pop()); // Should print 10
        System.out.println("Popped element: " + stack.pop()); // Should print 5
 
        // Check if the stack is empty
        System.out.println("Is the stack empty? " + stack.isEmpty()); // Should print true
    }
}