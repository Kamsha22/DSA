package StackArray;
public class StackArray {
    private int maxSize;
    private int[] stacArray;
    private int top;

    public StackArray(int size) {
        maxSize = size;
        stacArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (!isFull()) {
            stacArray[++top] = value;
        } else {
            System.out.println("Stack is full!");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            return stacArray[top--];
        } else {
            System.out.println("Stack is empty!");
            return -1;
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return stacArray[top];
        } else {
            System.out.println("Stack is empty!");
            return -1;
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public void display() {
        if (!isEmpty()) {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stacArray[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Stack is empty!");
        }
    }

    public static void main(String[] args) {
        StackArray stack = new StackArray(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display(); // Output: Stack elements: 10 20 30
        System.out.println("Peek: " + stack.peek());
        stack.display();
        System.out.println("Popped: " + stack.pop());
        stack.display();
        System.out.println("Is stack empty?" + stack.isEmpty());
        System.out.println("Is stack full?" + stack.isFull());
    }
}