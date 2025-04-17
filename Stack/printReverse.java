 //import java.util.Stack;

// public class insertAtBottom {
//     public static void main(String[] args) {
//         Stack<Integer> stack = new Stack<>();
//         stack.push(1);
//         stack.push(2);
//         stack.push(3);
//         int x = 4; // replace 4 with the value of x you want to insert
//         Stack<Integer> helper = new Stack<>();
//         while(stack.size()>0){
//             helper.push(stack.pop());
//         }
//         stack.push(x); // push x instead of 4
//         while(helper.size()>0){
//             stack.push(helper.pop());
//         }
//         System.out.println(stack);
//     }
// }

import java.util.Stack;

public class printReverse {
    public static void printReverse(Stack<Integer> stack, int x) {
        if (stack.size()==0) {
            stack.push(x);
            return;
        }
        int delete = stack.pop();
        printReverse(stack,x);
        stack.push(delete);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        int x=5;
        printReverse(stack,x);
        System.out.println(stack);
    }
}