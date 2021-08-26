package infoIII.u2_ordenamiento;

public class ej1 {
    public static void main(String[] args) {
        int[] array0 = new int[]{4, 3, 2, 10, 12, 1, 5, 6};
        int[] array1 = new int[]{4, 3, 2, 10, 12, 1, 5, 6};
        int[] array2 = new int[]{4, 3, 2, 10, 12, 1, 5, 6};
        int[] array4 = new int[]{4, 3, 2, 10, 12, 1, 5, 6};
        String[] arr = new String[]{"s","x", "e", "w", "j" };
        Auto[] arr2 = new Auto[4];
        arr2[0]= new Auto("abc123");
        arr2[1]= new Auto("qwe564");
        arr2[2]= new Auto("abc465");
        arr2[3]= new Auto("qwe120");

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

        Sort.insertionSort(arr);
        System.out.println("insert Generico: ");
        printArray(arr);

        Sort.insertionSort(arr2);
        System.out.println("insert Autos: ");
        printArray(arr2);


    }

    public static void printArray(int[] a) {
        for (int n : a) {
            System.out.print(n + " ");
        }
        System.out.print("\n");
    }
    public static <AnyType>
    void printArray(AnyType[] a) {
        for (AnyType n : a) {
            System.out.print(n + " ");
        }
        System.out.print("\n");
    }
}
