import java.util.Stack;

public class MyStack {

    public static void main(String[] args) {
        // Extend a class Vector 
        // Desta forma voce consegue usar os metodos de Vetores
        Stack<String> stack = new Stack<String>();

        stack.push("1"); // adiciona a pilha 
        stack.push("5");
        stack.push("4");
        stack.push("3");
        stack.push("2");
        
        System.out.println(stack.capacity());
        stack.add("coisa");
        stack.add("elemento");
        stack.setElementAt("algo", 0);
        System.err.println(stack);
       
        String TopStack = stack.pop(); // remove da pilha
        System.out.println(TopStack);
        System.out.println(stack);
        System.out.println("Retorna  o topo da pilha: " + stack.peek());

        System.out.println(stack.search("algo")); //retorna a posiçao em relaçao ao topo


    }
}
