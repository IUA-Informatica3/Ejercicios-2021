package infoIII.u3_ordenamiento;

import infoIII.Utils.Print;

/**
 * # Práctico 3: **Ordenamiento**
 * <p>
 * 1. Implemente los métodos de ordenamiento de **inserción**, **Shellsort** y **quicksort** usando las
 * implementaciones del teórico. Ejecútelos con los siguientes objetos:
 * <p>
 * 1. Enteros.
 * 2. Números reales de tipo double.
 * 3. Cadena de caracteres.
 */
// TODO: Not finished, only Enteros implemented
public class ej1 {
    public static void main(String[] args) {
        int[] array0 = new int[]{4, 3, 2, 10, 12, 1, 5, 6};  // Example data
        int[] array1 = new int[]{4, 3, 2, 10, 12, 1, 5, 6};
        int[] array2 = new int[]{4, 3, 2, 10, 12, 1, 5, 6};
        int[] array4 = new int[]{4, 3, 2, 10, 12, 1, 5, 6};
        String[] arr = new String[]{"s", "x", "e", "w", "j"};

        // Example of custom class used for sorting
        Auto[] arr2 = new Auto[4];

        arr2[0] = new Auto("abc123");
        arr2[1] = new Auto("qwe564");
        arr2[2] = new Auto("abc465");
        arr2[3] = new Auto("qwe120");

        Sort.insertionSort(array0);
        System.out.println("Insertion: ");
        Print.array(array0);

        Sort.shell(array1);
        System.out.println("Shell: ");
        Print.array(array1);

        Sort.quicksort(array2);
        System.out.println("QuickSort: ");
        Print.array(array2);

        Sort.quicksort2(array4);
        System.out.println("QuickSort2: ");
        Print.array(array4);

        Sort.insertionSort(arr);
        System.out.println("insert Generico: ");
        Print.array(arr);

        Sort.insertionSort(arr2);
        System.out.println("insert Autos: ");
        Print.array(arr2);
    }
}
