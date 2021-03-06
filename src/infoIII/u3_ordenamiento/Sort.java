package infoIII.u3_ordenamiento;

public class Sort {
    /**
     * Integer insertion sort algorithm
     *
     * @param item array of integer to sort
     */
    public static void insertionSort(int[] item) {
        for (int p = 1; p < item.length; p++) {
            int tmp = item[p];
            int j = p;
            //              tmp.compareTo(a[j-1]) < 0
            for (; j > 0 && tmp < item[j - 1]; j--)
                item[j] = item[j - 1];
            item[j] = tmp;
        }
    }

    /**
     * Double insertion sort algorithm
     *
     * @param item array of double to sort
     */
    public static void insertionSort(double[] item) {
        for (int p = 1; p < item.length; p++) {
            double tmp = item[p];
            int j = p;
            //              tmp.compareTo(item[j-1]) < 0
            for (; j > 0 && tmp < item[j - 1]; j--)
                item[j] = item[j - 1];
            item[j] = tmp;
        }
    }

    /**
     * Insertion sort algorithm with generic type
     *
     * @param item      array of AnyType to sort
     * @param <AnyType> Type that implements comparable
     */
    public static <AnyType extends Comparable<AnyType>>
    void insertionSort(AnyType[] item) {
        for (int p = 1; p < item.length; p++) {
            AnyType tmp = item[p];
            int j = p;
            //              tmp.compareTo(item[j-1]) < 0
            for (; j > 0 && tmp.compareTo(item[j - 1]) < 0; j--)
                item[j] = item[j - 1];
            item[j] = tmp;
        }
    }

    /**
     * Integer shell sort algorithm
     *
     * @param item array of double to sort
     */
    public static void shell(int[] item) {
        int n = item.length;
        int gap, i, j, temp;
        for (gap = n / 2; gap > 0; gap /= 2)
            for (i = gap; i < n; i++)
                for (j = i - gap; j >= 0 && item[j] > item[j + gap]; j -= gap) {
                    temp = item[j];
                    item[j] = item[j + gap];
                    item[j + gap] = temp;
                }
    }

    /**
     * Shell sort algorithm with generic type
     *
     * @param item      array of AnyType to sort
     * @param <AnyType> Type that implements comparable
     */
    public static <AnyType extends Comparable<AnyType>>
    void shell(AnyType[] item) {
        int n = item.length;
        int gap, i, j;
        AnyType temp;
        for (gap = n / 2; gap > 0; gap /= 2)
            for (i = gap; i < n; i++)
                for (j = i - gap; j >= 0 && item[j].compareTo(item[j + gap]) > 0; j -= gap) {
                    temp = item[j];
                    item[j] = item[j + gap];
                    item[j + gap] = temp;
                }
    }

    /**
     * Integer quick sort algorithm
     *
     * @param item array of integers to sort
     */
    public static void quicksort(int[] item) {
        quicksort(item, 0, item.length - 1);
    }


    private static void quicksort(int[] item, int left, int right) {
        int i, j, temp;
        i = left;
        j = right;
        do {
            while (item[j] > item[i] && j > i)
                j--;
            if (i < j) {
                temp = item[i];
                item[i] = item[j];
                item[j] = temp;
                i++;
            }
            while (item[i] < item[j] && i < j)
                i++;
            if (i < j) {
                temp = item[i];
                item[i] = item[j];
                item[j] = temp;
                j--;
            }
        } while (i < j);
        if (left < j) quicksort(item, left, j - 1);
        if (i < right) quicksort(item, i + 1, right);
    }

    /**
     * Integer quick sort algorithm
     *
     * @param item array of integers to sort
     */
    public static void quicksort2(int[] item) {
        quicksort2(item, 0, item.length - 1);
    }

    private static void quicksort2(int[] array, int ini, int fin) {
        int i = ini, j = fin, temp;
        // int pivo = array[(fin + ini) / 2];
        int pivo = array[ini];
        while (i <= j) {
            while (array[i] < pivo) i++;
            while (array[j] > pivo) j--;
            if (i <= j) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (ini < j) quicksort2(array, ini, j);
        if (i < fin) quicksort2(array, i, fin);
    }

    /**
     * Quick Sort implemetation with generic type
     *
     * @param item      array of AnyType to sort
     * @param <AnyType> Type that implements comparable
     */
    public static <AnyType extends Comparable<AnyType>>
    void quicksort2(AnyType[] item) {
        quicksort2(item, 0, item.length - 1);
    }

    private static <AnyType extends Comparable<AnyType>>
    void quicksort2(AnyType[] array, int ini, int fin) {
        int i = ini, j = fin;
        AnyType temp;
        AnyType pivo = array[(fin + ini) / 2];
        // AnyType pivo = array[ini];
        while (i <= j) {
            while (array[i].compareTo(pivo) < 0) i++;
            while (array[j].compareTo(pivo) > 0) j--;
            if (i <= j) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (ini < j) quicksort2(array, ini, j);
        if (i < fin) quicksort2(array, i, fin);
    }
}
