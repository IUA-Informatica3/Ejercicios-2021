package infoIII.u1_analisis_de_algoritmos;

public class Ej7 {

    public static void main(String[] args) {
        for (int i = 0; i < 400; i++) {
            System.out.println(i + " " + isPrime(i));
        }
    }

    /**
     * Say if num is a prime number
     * Algorithm of order
     * O(   )
     *
     * @param num Number to evaluate
     * @return True if num is prime
     */
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        double sqrt = Math.sqrt(num);
        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
