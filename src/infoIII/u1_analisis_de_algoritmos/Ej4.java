package infoIII.u1_analisis_de_algoritmos;

public class Ej4 {

    public static void main(String[] args) {
        int[] a1 = new int[100];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = (int) (Math.random() * 100);
        }
        createPairs(a1);
    }

    /**
     * Print each par of number from array
     * Algorithm of order
     * O(   )
     *
     * @param arr Array to print pairs
     */
    public static void createPairs(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println(arr[i] + ", " + arr[j]);
            }
        }
    }
}
