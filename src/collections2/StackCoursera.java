package collections2;

import java.util.Stack;

public class StackCoursera {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println(stack.size());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.size());
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);

    }
}
