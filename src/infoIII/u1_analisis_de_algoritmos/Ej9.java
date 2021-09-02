package infoIII.u1_analisis_de_algoritmos;

public class Ej9 {

    public static void main(String[] args) {
        int[] a1 = new int[7000];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = (int) (Math.random() * 10000);
        }
        int[] a2 = copyArray(a1);
        System.out.println(a2[0]);
    }

    /**
     * Generates a Copy of the array
     * Algorithm of order
     * O(   )
     *
     * @param array Array to be copied
     * @return New array with the same elements
     */
    static int[] copyArray(int[] array) {
        int[] copy = new int[0];
        for (int value : array) {
            copy = appendToNew(copy, value);
        }
        return copy;
    }

    static int[] appendToNew(int[] array, int value) {
        int[] bigger = new int[array.length + 1];
        for (int I = 0; I < array.length; I++) {
            bigger[I] = array[I];
        }
        bigger[bigger.length - 1] = value;
        return bigger;
    }
}
