package infoIII.U5_LinkedStack_LinkedQueue;

import infoIII.Estructuras.ListQueue;
import infoIII.Estructuras.Queue;

public class testListQueue {
    public static void main(String[] args) {
        Queue<Integer> miQueue = new ListQueue<>();

        miQueue.enqueue(4);
        miQueue.enqueue(7);
        miQueue.enqueue(90);


        try {
            System.out.println(miQueue.getFront());
            System.out.println(miQueue.dequeue());
            System.out.println(miQueue.dequeue());
            System.out.println(miQueue.dequeue());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }



        try {
            miQueue.getFront();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            miQueue.dequeue();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        for (int i = 0; i < 25; i++) {
            miQueue.enqueue(i);
        }
        for (int i = 0; i < 25; i++) {
            try {
                System.out.println(miQueue.dequeue());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
