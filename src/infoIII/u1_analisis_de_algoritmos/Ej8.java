package infoIII.u1_analisis_de_algoritmos;

public class Ej8 {

    public static void main(String[] args) {
        System.out.println(factorialOf(5));

    }

    /**
     * Calculates de factorial of n recursively
     * Algorithm of order
     * O(   )
     *
     * @param n Number to calculate facotorial
     * @return Value of n!
     */
    public static int factorialOf(int n) {
        switch (n) {
            case 0:
            case 1:
                return 1;
            default:
                return n * factorialOf(n - 1);
        }
    }
}
