package check;
import java.util.Scanner;
public class Parentheses {
    private int maxSize;
    private int top;
    private char[] stackArray;

    public Parentheses(int size) {
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

    public static boolean isBalanced(String str) {
        Parentheses stack = new Parentheses(str.length());
        for (char ch : str.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else if (ch == '}' || ch == ']' || ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                char last = stack.pop();
                if ((ch == '}' && last != '{') || (ch == ']' && last != '[') || (ch == ')' && last != '(')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of parentheses: ");
        String input = scanner.nextLine();
        if (isBalanced(input)) {
            System.out.println("The expression has balanced parentheses.");
        } else {
            System.out.println("The expression has imbalanced parentheses.");
        }
    }
}