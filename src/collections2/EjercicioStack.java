package collections2;

import java.util.Stack;

public class EjercicioStack {
    public static void main(String[] args) {
        String str = "Pepep le apesta la mierda";

        StringReverser reverser = new StringReverser();
        String result = reverser.reverse(str);
        System.out.println(result);
    }
}

class StringReverser {
    public String reverse(String input){
        Stack<Character> stack = new Stack<Character>() ;
        for (char ch: input.toCharArray()){
            stack.push(ch);
        }
        String reversed = "";
        while (!stack.empty()){
            reversed += stack.pop();
        }
        return "La cadena normal era: "+ input + " el resultado en reversa es: "+reversed;
    }
}
