import java.util.*;
import java.util.Arrays;

public class MyBinarySearch {

    public static void main(String[] args) {
        int arraySize = 10000;
        int array[] = new int[arraySize];

        int dataSearch = 21;

        for (int i = 0; i < arraySize; i++) {

            array[i] = i;
        }

        int index = Arrays.binarySearch(array, dataSearch);
        System.err.println("FOUND: " + index);

    }
}
