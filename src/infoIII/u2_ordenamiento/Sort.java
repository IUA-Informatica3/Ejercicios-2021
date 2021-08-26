package infoIII.u2_ordenamiento;

public class Sort {
    public static void insertionSort(int[] item) {
        for (int p = 1; p < item.length; p++) {
            int tmp = item[p];
            int j = p;
            for (; j > 0 && tmp < item[j - 1]; j--)
                item[j] = item[j - 1];
            item[j] = tmp;
        }
    }

    public static void quicksort(int[] item) {
        quicksort(item, 0, item.length - 1);
    }

    public static void shell(int[] v) {
        int n = v.length;
        int gap, i, j, temp;
        for (gap = n / 2; gap > 0; gap /= 2)
            for (i = gap; i < n; i++)
                for (j = i - gap; j >= 0 && v[j] > v[j + gap]; j -= gap) {
                    temp = v[j];
                    v[j] = v[j + gap];
                    v[j + gap] = temp;
                }
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


    public static void quicksort2(int[] item) {
        quicksort2(item, 0, item.length - 1);
    }
    private static void quicksort2(int[] array, int ini, int fin) {
        int i = ini, j = fin, temp;
        int pivo = array[(fin + ini) / 2];
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
}
