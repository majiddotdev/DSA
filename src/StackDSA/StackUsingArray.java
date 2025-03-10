package StackDSA;

public class StackUsingArray {
    private  int[] arr;
    private int top;
    private int capacity;

    public StackUsingArray(int size) {
        arr = new int[size];
        top = 0;
        capacity = size;
    }

    public void push(int data) {
        if (top == capacity) {
            System.out.println("Stack Overflow! Cannot push " + data);
            return;
        }
        arr[top++] = data;
    }

    public int pop() {
        if (top == 0) {
            System.out.println("Stack Underflow! No elements to pop.");
            return -1;
        }
        return arr[--top];
    }

    public int peek() {
        if (top == 0) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return arr[top - 1];
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Current size: " + stack.size());
        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped: " + stack.pop());
        System.out.println("Current size: " + stack.size());
        System.out.println(stack.isEmpty());
    }
}
