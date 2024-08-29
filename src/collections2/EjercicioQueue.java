package collections2;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class EjercicioQueue {
    public static void reverse(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("El stack inicia asi: " + stack);
        System.out.println("EL queue inicia asi: " + queue);
        while (!queue.isEmpty()){
            stack.push(queue.remove());
        }
        System.out.println("En el segundo paso el stack queda asi: " + stack);
        System.out.println("En el segundo paso la queue quesa asi: " + queue);
        while (!stack.isEmpty()){
            queue.add(stack.pop());
        }
        System.out.println("Al final el stack: " + stack);
        System.out.println("Al final el queue: " + queue);

    }

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<Integer>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        reverse(queue);
        System.out.println(queue);
    }
}
