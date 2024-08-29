public class DynamicArray {
    private int size;
    private int capacity = 10;
    private Object[] array;
    private double redimensionFactor = 1.4;

    // Constructor
    public DynamicArray() {

        this.array = new Object[capacity];

    }

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];

    }

    // Redimension and others
    // Crescer array
    private void DynamicArrayRedimension() {
        this.capacity = (int)(capacity * redimensionFactor); // Factor multiply capacity array
        Object[] arrayTemp = new Object[capacity];

        if (array != null) {
            for (int i = 0; i < size; i++) {
                arrayTemp[i] = array[i];
            }
        }

        // ou
        // if (array != null) {
        // int count = 0;
        // for (Object e : array) {
        // arrayTemp[count++] = e;
        // }
        // }

        this.array = arrayTemp;

    }

    // encolher array
    private void shrink() {

        this.capacity = (int)(capacity / redimensionFactor); // Factor multiply capacity array
        Object[] arrayTemp = new Object[capacity];

        if (array != null) {
            for (int i = 0; i < size; i++) {
                arrayTemp[i] = array[i];
            }
        }

        // ou
        // if (array != null) {
        // int count = 0;
        // for (Object e : array) {
        // arrayTemp[count++] = e;
        // }
        // }

        this.array = arrayTemp;

    }

    private boolean isEmpty() {
        return size == 0;
    }

    // Usability Public methods
    public void add(Object data) {
        if (size == capacity) {
            DynamicArrayRedimension();
        }
        // add data to size and then increment size
        array[this.size++] = data;
        

    }

    public void remove(Object data) {
        // TODO:

        for (int i = 0; i < size; i++) {

            if (array[i] == data) {
                // reajusta os elementos a direita do removido
                for (int j = 0; j < (size - i - 1); j++) { // -1 por causa do index valo que fica no ultima posiçao

                    array[i + j] = array[i + j + 1]; // +1, para pegar o posterior e atribuir no atual

                }
                array[size - 1] = null; // lipar o ultimo index que foi movido

                this.size--; // ajusta o size

                if (size <= (int) (capacity / redimensionFactor)) { // verifica se precisa encolher o array
                    shrink();
                }
                System.out.println("size: " + size + " capacity: " + capacity);
                return;
            }

        }
    }

    public void insert(int index, Object data) {
        array[index] = data;
        for (int j = size - 1; j == (index); j--) { // -1 por causa do index valo que fica no ultima posiçao

            array[j + 1] = array[j]; // +1, para pegar o posterior e atribuir no atual

        }
    }

    public int search(Object data) {
        for (int i = 0; i < size; i++) {
            if (array[i] == data) {
                return 1;

            }

        }
        return -1;
    }

    public String toString() {
        String string = "";
        {
            for (Object e : array) {

                string += e + " --> ";

            }
            // 0: Indica que a nova string deve começar no índice 0 da string original.
            // string.length() - 2: Indica o índice final da nova string, que é dois
            // caracteres antes do final da string original.
            // Portanto, a nova string exclui os últimos dois caracteres da string original.
            if (string != "") {
                string = "[" + string.substring(0, string.length() - 5) + "]";
            }
            return string;

        }
    }
}