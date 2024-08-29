
import java.util.*;
import java.util.PriorityQueue;
import java.util.Queue;

class MyPriorityQueue {

    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder()); // Collections.reverseOrder() usando
                                                                               // isso, a remoçao da fila sera pela
                                                                               // ordem numerica descrecente
        queue.add("1"); // ou offer()
        queue.add("7");
        queue.add("6");
        queue.add("5");
        queue.add("3");
        queue.add("2");
        System.out.println("Queue: " + queue);

        while (!queue.isEmpty()) {

            System.out.println(queue.poll());

        }

    }

}