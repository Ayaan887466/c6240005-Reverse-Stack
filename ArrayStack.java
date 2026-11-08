package Assngment;


    public class ArrayStack {

        private int[] stack;
        private int top;

        public ArrayStack(int capacity) {
            stack = new int[capacity];
            top = -1;
        }

        public void push(int value) {
            if (top == stack.length - 1) {
                expandCapacity();
            }
            stack[++top] = value;
        }

        public int pop() {
            return stack[top--];
        }

        public boolean isEmpty() {
            return top == -1;
        }

        private void expandCapacity() {
            int[] newStack = new int[stack.length * 2];

            for (int i = 0; i <= top; i++) {
                newStack[i] = stack[i];
            }

            stack = newStack;
        }
    }