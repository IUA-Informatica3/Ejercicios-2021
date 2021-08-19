package infoIII.u0_analisis;


import java.util.Arrays;

public class Ej11 {

    public static void main(String[] args) {
        int[] a1 = new int[100];
        int[] a2 = new int[200];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = (int) (Math.random() * 10000);
        }
        for (int i = 0; i < a2.length; i++) {
            a2[i] = (int) (Math.random() * 10000);
        }

        System.out.println(intersection(a1, a2));

    }

    /**
     * Calculates the number of elements in common between the arrays
     * Algorithm of order
     * O(   )
     *
     * @param a first array
     * @param b second array
     * @return Number of elements in common
     */
    static int intersection(int[] a, int[] b) {

        Arrays.sort(a);
        Arrays.sort(b);
        int intersect = 0;
        for (int x : a) {
            if (efficientSearch(b, x) >= 0) {
                intersect++;
            }
        }

        return intersect;
    }

    public static int efficientSearch(int[] array, int item) {
        int minIndex = 0;
        int maxIndex = array.length - 1;
        int currentIndex;
        int currentElement;

        while (minIndex <= maxIndex) {
            currentIndex = (minIndex + maxIndex) / 2;
            currentElement = array[currentIndex];

            if (currentElement < item) {
                minIndex = currentIndex + 1;
            } else if (currentElement > item) {
                maxIndex = currentIndex - 1;
            } else {
                return currentIndex;
            }
        }
        return -1;
    }
}