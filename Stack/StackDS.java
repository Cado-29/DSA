package Stack;

import java.util.Stack;

class StackDS {
    public static void main(String[] args) {

        // LIFO, Last in First Out
        // Stores objects
        Stack<String> stack = new Stack<>();
        stack.push("FH6");
        stack.push("FH5"); // next item that would be removed
        String game = stack.peek();
        System.out.println(stack.empty());
        System.out.println(game);
        System.out.println(stack.search("FH6")); // Top is one, index top is 1 when using search()
        System.out.println(stack.get(0)); // Index starts from 0
        stack.pop(); // too much pop empty exception
        System.out.println(stack);
        System.out.println(stack.size());

        // undo/redo features
        // page/ folder navigation back and forward
        // calling function

    }
}