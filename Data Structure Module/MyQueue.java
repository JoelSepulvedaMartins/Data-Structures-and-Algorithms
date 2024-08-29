
import java.util.LinkedList;
import java.util.Queue;

class MyQueue {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<String>();
        queue.add("1"); // ou offer()
        queue.add("7");
        queue.add("6");
        queue.add("5");
        queue.add("3");
        queue.add("2");
        System.out.println("Queue: " + queue);

        System.out.println(queue.poll()); //  ou remove() restorna e remove a cabeça da fila
        System.out.println(queue.size());

        System.out.println("Queue: " + queue);

        System.out.println(queue.peek()); // ou element() para pegar o primeiro da fila sem remover
        System.out.println(queue);

        System.out.println(queue.contains("5"));
        
    }

}