package infoIII.u0_analisis;


import java.util.Arrays;

public class Ej6 {

    public static void main(String[] args) {
        int[] a1 = new int[7000];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = (int) (Math.random() * 10000);
        }
        Arrays.sort(a1);
        System.out.println(efficientSearch(a1, 325));

    }

    /**
     * Search de value item in the array ( array values must be ordered)
     * Algorithm of order
     * O(   )
     *
     * @param array Where to search
     * @param item  What to search
     * @return position where item was found
     */
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