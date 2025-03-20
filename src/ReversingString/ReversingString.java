package ReversingString;
import java.util.Scanner;

public class  ReversingString {
    private int maxSize;
    private int top;
    private char[] stackArray;

    public ReversingString(int size) {
        this.maxSize = size;
        this.stackArray = new char[maxSize];
        this.top = -1;
    }

    public void push(char item) {
        if (isFull()) {
            System.out.println("Stack is full!");
            return;
        }
        stackArray[++top] = item;
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return '\0';
        }
        return stackArray[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        ReversingString stack = new ReversingString(input.length());

        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        System.out.print("Reversed string: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println();
    }
}