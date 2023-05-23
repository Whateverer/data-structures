package datastructures;

import java.util.Stack;

public class QueueWIthTwoStacks {
    public static class MyQueue<T> {
        private Stack<T> stackNewestOnTop = new Stack<>();
        private Stack<T> stackOldestOnTop = new Stack<>();

        public void enqueue(T value) {
            stackNewestOnTop.push(value);
        }

        public T peek() {
            // move elements from stackNewest to stackOldest
            shiftStacks();
            return stackOldestOnTop.peek();
        }

        private void shiftStacks() {
            if (stackOldestOnTop.isEmpty()) {
                while (!stackNewestOnTop.isEmpty()) {
                    stackOldestOnTop.push(stackNewestOnTop.pop());
                }
            }
        }

        public T dequeue() {
            return stackNewestOnTop.pop();
        }
    }
}
