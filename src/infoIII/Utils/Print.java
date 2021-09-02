package infoIII.Utils;

/**
 * Helper class with diferent utils functions
 */
public class Print {
    /**
     * Print the array a on screen
     *
     * @param a integer array to print
     */
    public static void array(int[] a) {
        for (int n : a) {
            System.out.print(n + " ");
        }
        System.out.print("\n");
    }

    /**
     * Print the array a on screen
     *
     * @param a         array to print
     * @param <AnyType> type of the array
     */
    public static <AnyType>
    void array(AnyType[] a) {
        for (AnyType n : a) {
            System.out.print(n + " ");
        }
        System.out.print("\n");
    }
}