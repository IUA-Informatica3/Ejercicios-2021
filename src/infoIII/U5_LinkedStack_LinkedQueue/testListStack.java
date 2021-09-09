package infoIII.U5_LinkedStack_LinkedQueue;

import infoIII.Estructuras.ListStack;
import infoIII.Estructuras.Stack;

public class testListStack {
    public static void main(String[] args) {
        Stack<Integer> miStack = new ListStack<>();

        miStack.push(4);
        miStack.push(7);
        miStack.push(90);


        try {
            miStack.pop();
            System.out.println(miStack.top());
            System.out.println(miStack.topAndPop());
            miStack.pop();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }



        try {
            miStack.pop();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            miStack.top();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            miStack.topAndPop();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        for (int i = 0; i < 24; i++) {
            miStack.push(i);
        }
    }
}
