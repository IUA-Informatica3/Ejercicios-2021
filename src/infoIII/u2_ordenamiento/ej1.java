package infoIII.u2_ordenamiento;

public class ej1 {
    public static void main(String[] args) {
        int[] array0 = new int[]{4, 3, 2, 10, 12, 1, 5, 6};
        int[] array1 = new int[]{4, 3, 2, 10, 12, 1, 5, 6};
        int[] array2 = new int[]{4, 3, 2, 10, 12, 1, 5, 6};
        int[] array4 = new int[]{4, 3, 2, 10, 12, 1, 5, 6};

        Sort.insertionSort(array0);
        System.out.println("Insertion: ");
        printArray(array0);
        Sort.shell(array1);
        System.out.println("Shell: ");
        printArray(array1);
        Sort.quicksort(array2);
        System.out.println("QuickSort: ");
        printArray(array2);
        Sort.quicksort2(array4);
        System.out.println("QuickSort2: ");
        printArray(array4);

    }

    public static void printArray(int[] a) {
        for (int n : a) {
            System.out.print(n + " ");
        }
        System.out.print("\n");
    }
}
