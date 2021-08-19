package infoIII.u0_analisis;

public class Ej0 {
    public static void main(String[] args) {
        int[] arreglo = new int[20];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 1000);
        }
        printArray(arreglo);
    }

    /**
     * Muestra un arraeglo en consola
     * Algorithm of order
     * O(   )
     *
     * @param arr arreglo a mostrar
     */
    public static void printArray(int[] arr) {  // n = arr.lenght
        for (int j : arr) {
            System.out.print(j);   // O0(n) = n
            System.out.print(' ');
        }
        System.out.print('\n');    // O1(n) = 1
    } // O( n )
}
