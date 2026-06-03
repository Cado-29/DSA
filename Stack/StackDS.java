package Stack;

import java.util.Stack;

class StackDS {
    public static void main(String[] args) {

        // LIFO, Last in First Out
        // Stores objects
        Stack<String> stack = new Stack<>();
        stack.push("FH6");
        String game = stack.peek();
        System.out.println(stack.empty());
        System.out.println(game);
        System.out.println(stack.search("FH6"));
        stack.pop();
        System.out.println(stack);

        // undo/redo features
        // page/ folder navigation back and forward
        // calling function

    }
}