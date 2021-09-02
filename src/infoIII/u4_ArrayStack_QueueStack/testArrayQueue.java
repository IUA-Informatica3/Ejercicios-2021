package infoIII.u4_ArrayStack_QueueStack;

import infoIII.Estructuras.ArrayQueue;
import infoIII.Estructuras.Queue;

public class testArrayQueue {
    public static void main(String[] args) {
        Queue<Integer> miQueue = new ArrayQueue<>();

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
