import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList_Vs_ArrayList {

    // ArrayList
    private ArrayList<Integer> arrayList;

    // LinkedList
    private LinkedList<Integer> linkedList;

    public LinkedList_Vs_ArrayList() {
        arrayList = new ArrayList<>();
        linkedList = new LinkedList<>();
    }

    //Medir tempo para adicionar elementos
    public void measureAddPerformance(int numElements) {
        long startTime, endTime;

        // Medindo   tempo para ArrayList
        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            arrayList.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("Time to add " + numElements + " elements to ArrayList: " + (endTime - startTime) + " ns");

        //Medindo tempo para LinkedList
        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("Time to add " + numElements + " elements to LinkedList: " + (endTime - startTime) + " ns");
    }

    // Medir tempo para remover elementos
    public void measureRemovePerformance(int numElements) {
        long startTime, endTime;

        // Removendo elementos do ArraList
        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            arrayList.remove(Integer.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("Time to remove " + numElements + " elements from ArrayList: " + (endTime - startTime) + " ns");

        // Removendo elementos do Linked List
        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            linkedList.remove(Integer.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("Time to remove " + numElements + " elements from LinkedList: " + (endTime - startTime) + " ns");
    }

    // Medir tempo para buscar elementos
    public void measureSearchPerformance(int numElements) {
        long startTime, endTime;

        //   Buscando elementos no Array List

        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            arrayList.contains(i);
        }
        endTime = System.nanoTime();
        System.out.println("Time to search " + numElements + " elements in ArrayList: " + (endTime - startTime) + " ns");

        // Buscando elementos no LinkedList
        
        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            linkedList.contains(i);
        }
        endTime = System.nanoTime();
        System.out.println("Time to search " + numElements + " elements in LinkedList: " + (endTime - startTime) + " ns");
    }

    public static void main(String[] args) {
        LinkedList_Vs_ArrayList listComparison = new LinkedList_Vs_ArrayList();
        int numElements = 10000;

        System.out.println("Adding Elements:");
        listComparison.measureAddPerformance(numElements);

        System.out.println("\nSearching Elements:");
        listComparison.measureSearchPerformance(numElements);

        System.out.println("\nRemoving Elements:");
        listComparison.measureRemovePerformance(numElements);
    }
}
