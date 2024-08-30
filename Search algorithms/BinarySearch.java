import java.util.*;

public class BinarySearch {
    // Main para teste de funcionamento do algoritmo
    public static void main(String[] args) {
        int arraySize = 100000000;

        // // LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(8, 10, 25, 28, 29, 35, 45, 57, 100));
        int index1 = binarySearchAlg(8, linkedList);
        printResult(index1);
        index1 = binarySearchAlg(10, linkedList);
        printResult(index1);
        index1 = binarySearchAlg(25, linkedList);
        printResult(index1);
        index1 = binarySearchAlg(28, linkedList);
        printResult(index1);
        index1 = binarySearchAlg(29, linkedList);
        printResult(index1);
        index1 = binarySearchAlg(35, linkedList);
        printResult(index1);
        index1 = binarySearchAlg(45, linkedList);
        printResult(index1);
        index1 = binarySearchAlg(57, linkedList);
        printResult(index1);
        index1 = binarySearchAlg(100, linkedList);

        // ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList());
        // Gera uma ArrayList Crescente
        for (int i = 0; i < arraySize; i++) {

            arrayList.add(i);
        }

        int index2 = binarySearchAlg(25, arrayList);

        printResult(index2);

        // array de Objetos

        Integer[] array = new Integer[arraySize];
        // Gera um array crescente
        for (int i = 0; i < arraySize; i++) {

            array[i] = i;
        }

        int index3 = binarySearchAlg(45, array);

        printResult(index3);

    }

    // Print do resutado
    public static void printResult(int index) {
        if (index != -1) {
            System.out.println("Elemento encontrado no indice ===>> " + index + "\n\n\n\n");
        } else {
            System.out.println("Elemento nao encontrado" + "\n\n\n\n");
        }
    }

    // Metodo generico para aceitar qualquer estrutura de dados que implemente
    // // Collection
    public static <T extends Comparable<T>> int binarySearchAlg(T dataSearch, Collection<T> collectionSortedCrescent) {
        // Convertendo a coleção em uma lista para acesso por índice
        List<T> arraySortedCrescent = new ArrayList<>(collectionSortedCrescent);

        int low = 0;
        int high = arraySortedCrescent.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Para evitar Overflow no calculo em arrays muito grandes

            // Compara o elemento do meio com o valor buscado
            if (arraySortedCrescent.get(mid).compareTo(dataSearch) == 0) {

                return mid;
            }
            System.out.println("Elemento encontrado no indice: " + mid + ". Elemento array: "
                    + arraySortedCrescent.get(mid) + "  Objetivo:  " + dataSearch);
            // Se o valor no meio for menor busca na metade superior
            if (arraySortedCrescent.get(mid).compareTo(dataSearch) < 0) {
                low = mid + 1;
            }
            // Se o valor no mei o for maior busca na metade inferior
            else {
                high = mid - 1;
            }
        }

        return -1; // Elemento nao encontrado
    }

    // OverLoad do metodo para aceitar arrays diretamente
    public static <T extends Comparable<T>> int binarySearchAlg(T dataSearch, T[] arraySortedCrescent) {
        int low = 0;
        int high = arraySortedCrescent.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Para evitar Overflow no calculo em arrays muito grandes

            if (arraySortedCrescent[mid].compareTo(dataSearch) == 0) {

                return mid;
            }

            System.out.println("Elemento encontrado no indice: " + mid + " Elemento array: " + arraySortedCrescent[mid]
                    + " Objetivo:  " + dataSearch);
            if (arraySortedCrescent[mid].compareTo(dataSearch) < 0) {
                low = mid + 1; // REALIZA A PODA
            }

            else {
                high = mid - 1; // REALIZA A PODA
            }
        }

        return -1;
    }
}
