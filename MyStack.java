class Stack {
    int size;
    int[] arr;
    int top = -1;

    Stack(int size) {
        this.size = size;
        arr = new int[size];
    }
    void push(int data) {
        if (top == size - 1) {
            System.out.println("Stack is full");
        } else {
            top++;
            arr[top] = data;
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            top--;
        }
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(arr[top]);
        }
    }
}

public class MyStack {
    public static void main(String[] args) {
        Stack s = new Stack(5);

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);

        s.peek();

        s.pop();

        s.peek();
    }
}