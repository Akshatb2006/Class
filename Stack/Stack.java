public class Stack {
    public static void main(String[] args) {
        int stack[] = new int[5];
        int top = -1;
        top = push(stack, top,1);
        top = push(stack, top,2);
        top = push(stack, top,3);
        top = push(stack, top,4);
        display(stack, top);
        isEmpty(stack, top);
        top = pop(stack, top);
        display(stack, top);
    }

    public static int push(int stack[], int top, int n) {
        if (top == stack.length - 1) {
            System.out.println("Stack overflow");
            return top;
        }
        top++;
        stack[top] = n;
        return top;
    }

    public static void display(int stack[], int top) {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack elements from bottom to top:");
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i]);
        }
        System.out.println("------------");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static int pop(int stack[], int top) {
        if (top == -1) {
            System.out.println("Stack underflow");
            return top;
        }
        top--;
        return top;
    }


    public static void isEmpty(int stack[], int top) {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }
}
