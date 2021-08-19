package infoIII.u0_analisis;

public class Ej3 {

    public static void main(String[] args) {
        int[] a1 = new int[7000];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = (int) (Math.random() * 10000);
        }
        System.out.println(naiveSearch(a1, 325));

    }

    /**
     * Search the value n in the array
     * Algorithm of order
     * O(   )
     *
     * @param arr Array to search
     * @param n   Value to search
     * @return True if value is found
     */
    public static boolean naiveSearch(int[] arr, int n) {
        for (int j : arr) {
            if (j == n) {
                return true;
            }
        }
        return false;
    }
}
