package com.company.u0_recursividad;

public class Ej1 {

    public static void main(String[] args) {
        try {
            System.out.println(factorial(5, 0));
            // System.out.println(factorial(-4));
        } catch (Exception e) {
            System.out.println("Exception on line: ");
            e.printStackTrace();
        }
    }

    // 4! = 4 * 3 * 2 * 1
    // 4! = 4 * ( 3 * 2 * 1 )
    // 4! = 4 * 3!
    // 0! = 1
    // -1!
    public static int factorial(int n, int call) throws Exception {
        int res;
        if (n < 0)
            throw new Exception("n cannot be negative");

        if (n == 0) {
            spacer(call);
            System.out.println(n + " -> 1");
            return 1;
        }

        spacer(call);
        System.out.println(n + " -> " + n + " * fact(" + (n - 1) + ")");

        res = factorial(n - 1, call+1);

        spacer(call);
        System.out.println(n + " -> " + n + " * " + res);

        return n * res;
    }

    private static void spacer(int call) {
        for (int i = 0; i < call; i++) {
            System.out.print("\t\t\t");
        }
    }
}
