package infoIII.u1_analisis_de_algoritmos;

import java.util.ArrayList;

public class Ej5 {

    public static void main(String[] args) {
        generateFib(10);
        for (Integer n : generateFib(15)) {
            System.out.println(n);
        }
    }

    /**
     * Return an array of lenght num with the num first elements
     * of Fibonacci serie
     * Algorithm of order
     * O(   )
     *
     * @param num Number of fibonacci values to calculate
     * @return An array with de fibonacci sequence
     */
    public static ArrayList<Integer> generateFib(int num) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            if (i == 1) {
                result.add(0);
            } else if (i == 2) {
                result.add(1);
            } else {
                result.add(result.get(i - 2) + result.get(i - 3));
            }
        }
        return result;
    }
}
