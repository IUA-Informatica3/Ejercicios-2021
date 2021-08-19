package infoIII.u0_analisis;

public class Ej1 {

    public static void main(String[] args) {
        for (int i = 0; i < 400; i += (3 + i) * 1.5) {
            System.out.println(isEven(i));
        }
    }

    /**
     * Test if a number is Even
     * Algorithm of order
     * O(   )
     *
     * @param n number to test
     * @return true if even
     */
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
