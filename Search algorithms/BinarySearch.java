import java.util.*;

public class BinarySearch {
    //Main para teste de funcionamento do algoritmo 
    public static void main(String[] args) {

        // LinkedList
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
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(3, 7, 12, 18, 22, 27, 31, 37, 40, 46, 52, 56, 62,
                67, 71, 76, 81, 85, 91, 96,
                103, 108, 113, 119, 124, 130, 135, 140, 145, 151, 157, 163, 168, 174, 179, 185, 191, 197, 203, 209,
                215, 221, 227, 233, 239, 245, 251, 257, 263, 269, 275, 281, 287, 293, 299, 305, 311, 317, 323, 329,
                335, 341, 347, 353, 359, 365, 371, 377, 383, 389, 395, 401, 407, 413, 419, 425, 431, 437, 443, 449,
                455, 461, 467, 473, 479, 485, 491, 497, 503, 509, 515, 521, 527, 533, 539, 545, 551, 557, 563, 569,
                575, 581, 587, 593, 599, 605, 611, 617, 623, 629, 635, 641, 647, 653, 659, 665, 671, 677, 683, 689,
                695, 701, 707, 713, 719, 725, 731, 737, 743, 749, 755, 761, 767, 773, 779, 785, 791, 797, 803, 809,
                815, 821, 827, 833, 839, 845, 851, 857, 863, 869, 875, 881, 887, 893, 899, 905, 911, 917, 923, 929,
                935, 941, 947, 953, 959, 965, 971, 977, 983, 989, 995, 1000));
        int index2 = binarySearchAlg(25, arrayList);

        printResult(index2);

        // array de Objetos
        Integer[] array = { 3, 7, 12, 18, 22, 27, 31, 37, 40, 46, 52, 56, 62, 67, 71, 76, 81, 85, 91, 96,
                103, 108, 113, 119, 124, 130, 135, 140, 145, 151, 157, 163, 168, 174, 179, 185, 191, 197, 203, 209,
                215, 221, 227, 233, 239, 245, 251, 257, 263, 269, 275, 281, 287, 293, 299, 305, 311, 317, 323, 329,
                335, 341, 347, 353, 359, 365, 371, 377, 383, 389, 395, 401, 407, 413, 419, 425, 431, 437, 443, 449,
                455, 461, 467, 473, 479, 485, 491, 497, 503, 509, 515, 521, 527, 533, 539, 545, 551, 557, 563, 569,
                575, 581, 587, 593, 599, 605, 611, 617, 623, 629, 635, 641, 647, 653, 659, 665, 671, 677, 683, 689,
                695, 701, 707, 713, 719, 725, 731, 737, 743, 749, 755, 761, 767, 773, 779, 785, 791, 797, 803, 809,
                815, 821, 827, 833, 839, 845, 851, 857, 863, 869, 875, 881, 887, 893, 899, 905, 911, 917, 923, 929,
                935, 941, 947, 953, 959, 965, 971, 977, 983, 989, 995, 1000 };
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
            int mid = low + (high - low) / 2; // Para evitar Overflow  no calculo em arrays muito grandes

            // Compara o  elemento do meio   com o valor buscado
            if (arraySortedCrescent.get(mid).compareTo(dataSearch) == 0) {

                return mid; 
            }
            System.out.println("Elemento encontrado no indice: " + mid + ". Elemento array: "
                    + arraySortedCrescent.get(mid) + "  Objetivo:  " + dataSearch);
            // Se o valor no   meio for menor   busca na metade superior
            if (arraySortedCrescent.get(mid).compareTo(dataSearch) < 0) {
                low = mid + 1;
            }
            // Se o valor no mei o for maior   busca na metade inferior
            else {
                high = mid - 1;
            }
        }

        return -1; // Elemento nao encontrado
    }

    // OverLoad  do metodo para aceitar  arrays diretamente
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
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
