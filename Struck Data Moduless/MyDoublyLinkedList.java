import java.util.*;

public class MyDoublyLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> doublyLinkedList = new LinkedList<>();

        // Linked List Simulando Uma STACK

        doublyLinkedList.push(1);
        doublyLinkedList.push(2);
        doublyLinkedList.push(3);

        System.out.println(doublyLinkedList + "\n");
        doublyLinkedList.pop();
        System.out.println(doublyLinkedList + "\n");

        doublyLinkedList = new LinkedList<>(); // reseta a linked list
        // linked List Simulando Uma FILA
        doublyLinkedList.offer(1);
        doublyLinkedList.offer(2);
        doublyLinkedList.offer(3);

        System.out.println(doublyLinkedList + "\n");
        doublyLinkedList.poll();
        System.out.println(doublyLinkedList + "\n");

        LinkedList<String> stringDoublyLinkedList = new LinkedList<>(); // reseta a linked list

        // Linked list como uma linked list duplamente encadeada
        stringDoublyLinkedList.add("a");
        stringDoublyLinkedList.add("b");
        stringDoublyLinkedList.add(1, "c");// adicionar c no indice 1 e move o b pra frente
        stringDoublyLinkedList.add("d");
        System.out.println(stringDoublyLinkedList + "\n");
        stringDoublyLinkedList.remove();// remove
        System.out.println(stringDoublyLinkedList);
        stringDoublyLinkedList.removeFirst(); // Remove da head
        stringDoublyLinkedList.removeLast(); // Remove da tail
        System.out.println(stringDoublyLinkedList);
        stringDoublyLinkedList.peekFirst(); // pega da head
        stringDoublyLinkedList.peekLast(); // pega da tail

    }

}
