package infoIII.u1_recursividad;

public class Ej6 {

    public static void main(String[] args) {
        try {
            System.out.println(contBin(1)); //   1
            System.out.println(contBin(2)); //  10
            System.out.println(contBin(3)); //  11
            System.out.println(contBin(4)); // 100
            System.out.println(contBin(5)); // 101
            System.out.println(contBin(13));// 1101
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


    public static int contBin(int n) {
//        int digito;
        if (n == 1)
            return 1;
        // 13 1101
        // 13 % 2 = 1
        // 13 / 2 = 6 -> 110

        // 6 % 2 = 0
        // 6 / 2 = 3 -> 11

//        digito = n % 2;  // puede ser 1 o 0
//
//        if (digito == 1)
//            return 1 + contBin(n / 2);
//        else
//            return 0 + contBin(n / 2);

        return n % 2 + contBin(n / 2);

    }
}
