package Queues;

import java.util.LinkedList;

public class LinkedListDS {
    // Stores a series of nodes (data, the reference to next or previous nodes)
    // Easy insertion and deletion - O(1)
    // Locating an element is hard, no index have to start from the head and search through every node
    // Two types of LinkedList 1. Singly   2. Doubly - Benefit is can traverse from both ways head to tail, tail to head (But uses more memory)
    public static void main(String[] args) {

        LinkedList<String> linkedListStack = new LinkedList<>();

        // Can be a stack and also a queue
        // Stack
        linkedListStack.push("A");
        linkedListStack.push("B");
        linkedListStack.push("C");
        linkedListStack.push("D");
        linkedListStack.push("F");

        System.out.println(linkedListStack);

        linkedListStack.pop();
        System.out.println(linkedListStack.indexOf("D"));
        System.out.println(linkedListStack);

        System.out.println("\n Queue \n");

        LinkedList<String> linkedListQueue = new LinkedList<>();

        // Queue
        linkedListQueue.offer("A");
        linkedListQueue.offer("B");
        linkedListQueue.offer("C");
        linkedListQueue.offer("D");
        linkedListQueue.offer("F");

        linkedListQueue.poll();

        linkedListQueue.add(3,"E");
        linkedListQueue.remove("E");

        System.out.println(linkedListQueue);
        // LinkedList method - indexOf
        System.out.println(linkedListQueue.indexOf("B")); // Starts at 0 

        linkedListQueue.addFirst("Z"); // returns void
        System.out.println(linkedListQueue.peekFirst());
        System.out.println(linkedListQueue.peekLast());
        System.out.println(linkedListQueue);

        String last = linkedListQueue.removeLast();
        System.out.println(last);

        // Implement Stacks/ Queues
        // GPS navigation
        // Music playlist
    }
    
}
