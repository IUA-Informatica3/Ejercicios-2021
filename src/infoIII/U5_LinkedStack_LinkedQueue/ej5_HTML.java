package infoIII.U5_LinkedStack_LinkedQueue;

import infoIII.Estructuras.ArrayStack;
import infoIII.Estructuras.ListStack;
import infoIII.Estructuras.Stack;

/**
 * Implemente un programa que ingresada una
 * función matemática, verifique si la cantidad de
 * (,[,{ que abren están balanceados con los que cierran.
 */
public class ej5_HTML {
    public static void main(String[] args) {
        String mathOK = "<html>\n" +
                "    <head>\n" +
                "        <title>Este es el titulo</title>\n" +
                "    </head>\n" +
                "    <body>\n" +
                "        <p sytle=\"boder:1\">un Parrafo</p>\n" +
                "        <ul>\n" +
                "            <li>item 1</li>\n" +
                "            <li>item 2</li>\n" +
                "            <li>item 3</li>\n" +
                "        </ul>\n" +
                "    </body>\n" +
                "</html>";

        System.out.println(checkHTML(mathOK));
    }

    private static boolean checkHTML(String math) {
        Stack<String> balanceo = new ListStack<>();
        int estado = 0;
        String etiqueta = "";

        for (int i = 0; i < math.length(); i++) {
            char letra = math.charAt(i);

            switch (estado) {
                case 0: // Estoy en texto común
                    if (letra == '<') {
                        if (math.charAt(i + 1) == '/') {
                            i++;
                            estado = 20;
                        } else
                            estado = 10;
                    }
                    break;
                case 10:  //Etiqueta que abre
                    if (letra == ' ') {
                        estado = 11;
                        balanceo.push(etiqueta);
                        etiqueta = "";
                        break;
                    }
                    if (letra == '>') {
                        estado = 0;
                        balanceo.push(etiqueta);
                        etiqueta = "";
                        break;
                    }
                    etiqueta += letra;
                    break;
                case 11:
                    if (letra != '>')
                        estado = 0;
                    break;
                case 20:   // Etiqueta que cierra
                    if (letra != '>') {
                        etiqueta += letra;
                    } else {
                        try {
                            if (balanceo.topAndPop().compareTo(etiqueta) != 0) {
                                return false;
                            }
                        } catch (Exception e) {
                            return false;
                        }
                        etiqueta = "";
                        estado = 0;
                    }
            }
        }
        return balanceo.isEmpty();
    }
}
