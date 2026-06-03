package Queues;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class PriorityQueueDS {
    public static void main(String[] args) {
        
        // FIFO
        // Highest priorities first before lower ones
        System.out.println("Queue\n");

        Queue<Double> queue = new LinkedList<>();

        queue.offer(3.0);
        queue.offer(4.5);
        queue.offer(3.9);
        queue.offer(2.0);

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        System.out.println("Prioirty Queue\n");


        Queue<Double> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        priorityQueue.offer(3.0);
        priorityQueue.offer(4.5);
        priorityQueue.offer(3.9);
        priorityQueue.offer(2.0);
        System.out.println(priorityQueue);

        while(!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }

        // on poll the order is correct but when printing the head and tail is only correct in between is not cosidered

        

    }

}