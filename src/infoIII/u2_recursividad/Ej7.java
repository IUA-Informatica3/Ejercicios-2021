package infoIII.u2_recursividad;

public class Ej7 {

    public static void main(String[] args) {
        try {
            // System.out.println(printN(9876));
            // System.out.println(factorial(-4));
        } catch (Exception e) {
            System.out.println("Exception on line: ");
            e.printStackTrace();
        }
    }

    // 15/10 = 1.5 = 1
    // 15%10 =       5

    // 27/10 = 2.5 = 2
    // 27%10 =       7

    // 9876/10 = 2.5 = 987
    // 9876%10 =       6

    // 987/10 = 2.5 = 98
    // 987%10 =       7

    // 98/10 = 2.5 = 9
    // 98%10 =       8

    // 9/10 = 2.5 = 0 // Base
    // 9%10 =       9

    public static void printN(int n) {

    }

    private static void spacer(int call) {
        for (int i = 0; i < call; i++) {
            System.out.print("\t\t\t");
        }
    }
}
