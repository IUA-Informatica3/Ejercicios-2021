package infoIII.u4_ArrayStack_QueueStack;

import infoIII.Estructuras.ArrayStack;
import infoIII.Estructuras.Stack;

/**
 * Implemente un programa que ingresada una
 * función matemática, verifique si la cantidad de
 * (,[,{ que abren están balanceados con los que cierran.
 */
public class ej4_balanceo_llaves {
    public static void main(String[] args) {
        String mathOK = "{[(3-5)+4]*[3+4]}";
        String mathBad1 = "{[(3-5]+4)*[3+4]}";
        String mathBad2 = "[(3-5)+4]*[3+4]}";
        String mathBad3 = "{{{{{{{{{{{{{{{{{[(3-5)+4]*[3+4]";

        System.out.println(checkMath(mathOK));
        System.out.println(checkMath(mathBad1));
        System.out.println(checkMath(mathBad2));
        System.out.println(checkMath(mathBad3));
    }

    private static boolean checkMath(String math) {
        Stack<Character> balanceo = new ArrayStack<>();

        for (int i = 0; i < math.length(); i++) {
            switch (math.charAt(i)) {
                case '{':
                    balanceo.push('}');
                    break;
                case '[':
                    balanceo.push(']');
                    break;
                case '(':
                    balanceo.push(')');
                    break;
                case '}':
                case ']':
                case ')':
                    try {
                        if (balanceo.topAndPop().compareTo(math.charAt(i)) != 0) {
                            return false;
                        }
                    } catch (Exception e) {
                        return false;
                    }
                    break;
            }
        }
        return balanceo.isEmpty();
    }
}
