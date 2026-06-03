package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDS {

    public static void main(String[] args) {

        // FIFO, First In First Out
        // Added to the end
        // Head  First in line
        // Tail Last in line
        // So Queue is an interface and cannot create a instand of an interface
        // add = enqueue, offer()
        // remove = dequeue, poll()

        Queue<String> queue = new LinkedList<>();
        queue.offer("Karen");
        queue.offer("George");
        queue.offer("Steve");
        queue.offer("Harold");
        queue.poll();
        queue.poll(); // no exception even out of elements
        System.out.println(queue);
        System.out.println(queue.peek()); // next item that would be removed

        // methods from Collection class
        System.out.println(queue.isEmpty());

        System.out.println(queue.size());

        System.out.println(queue.contains("Harold")); // boolean, not index

        // Printer Queue
        // Customer service line
        // Used in LinkedLists, PriorityQueues, Breath-first search
    }
    
}
