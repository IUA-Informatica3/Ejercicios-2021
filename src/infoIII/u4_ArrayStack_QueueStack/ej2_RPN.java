package infoIII.u4_ArrayStack_QueueStack;

import infoIII.Estructuras.ArrayStack;
import infoIII.Estructuras.Stack;

import java.util.Scanner;

public class ej2_RPN {
    public static void main(String[] args) {
        String a;
        boolean loop = true;
        Stack<Float> stack = new ArrayStack<>();
        Scanner scanner = new Scanner(System.in);

        while (loop) {
            a = scanner.nextLine();
            switch (a) {
                case "+":
                case "-":
                case "*":
                case "/":
                    operar(stack, a);
                    break;
                default:
                    try {
                        stack.push(Float.parseFloat(a));
                    } catch (Exception e) {
                        loop = false;
                    }
            }
        }
    }

    private static void operar(Stack<Float> stack, String a) {
        Float op2 = null;
        Float op1 = null ;
        Float res;

        try {
            op2 = stack.topAndPop();
            op1 = stack.topAndPop();
        } catch (Exception e) {
            if(op2 == null)
                System.out.println("\uD83D\uDD25 No hay ningun operando");
            else{
                stack.push(op2);
                System.out.println("\uD83D\uDD25 Falta un operando");
            }
            return;
        }

        switch (a){
            case "+":
                res = op1 + op2;
                break;
            case "-":
                res = op1 - op2;
                break;
            case "*":
                res = op1 * op2;
                break;
            default:
                res = op1 / op2;
                break;
        }
        System.out.println(res);
        stack.push(res);
    }
}
