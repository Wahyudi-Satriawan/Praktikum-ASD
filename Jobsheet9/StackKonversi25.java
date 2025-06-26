package Jobsheet9;

public class StackKonversi25 {
    int[] stack;
    int top;
    int size;

    public StackKonversi25() {
        this.size = 32;
        stack = new int[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int value) {
        if (!isFull()) {
            stack[++top] = value;
        }
    }

    public int pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            return -1;
        }
    }

    public void print() {
        while (!isEmpty()) {
            System.out.print(pop());
        }
        System.out.println();
    }
}
