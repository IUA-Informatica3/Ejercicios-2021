package infoIII.u1_analisis_de_algoritmos;

public class Ej2 {

    public static void main(String[] args) {
        int[] a1 = new int[100];
        int[] a2 = new int[50];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = (int) (Math.random() * 10000);
        }
        for (int i = 0; i < a2.length; i++) {
            a2[i] = (int) (Math.random() * 10000);
        }
        System.out.println(areYouHere(a1, a2));
    }

    /**
     * Test if any value from arr1 is in arr2
     * Algorithm of order
     * O(   )
     *
     * @param arr1 first array
     * @param arr2 second array
     * @return true if any value of arr1 is in arr2
     */
    public static boolean areYouHere(int[] arr1, int[] arr2) {

        for (int el1 : arr1) {
            for (int el2 : arr2) {
                if (el1 == el2) return true;
            }
        }
        return false;
    }
}
