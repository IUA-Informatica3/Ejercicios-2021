package infoIII.U5_LinkedStack_LinkedQueue;

import infoIII.Estructuras.*;

public class ej4_exp {
    public static void main(String[] args) {

        int elementos = 100000000;

        experimentarQueue(elementos, new ListQueue<>(), "ListQueue");
        experimentarQueue(elementos, new ArrayQueue<>(),"ArrayQueue");
        experimentarStack(elementos, new ListStack<>(), "ListStack");
        experimentarStack(elementos, new ArrayStack<>(), "ArrayStack");

    }

    public static void experimentarQueue(int cantElementos, Queue<Integer> queue, String nombre) {
        long inicioAgregar = System.currentTimeMillis();

        for (int i = 0; i < cantElementos; ++i) {
            queue.enqueue(i);
        }

        long tiempoAgregar = System.currentTimeMillis() - inicioAgregar;

        System.out.println("\n"+nombre+": ");
        System.out.println("Demora en agregar: " + tiempoAgregar + " ms");

        long inicioSacar = System.currentTimeMillis();
        try {
            while (!queue.isEmpty()) {
                queue.dequeue();
            }
        } catch (Exception e) {
            System.out.println("Error!");
        }

        long tiempoSacar = System.currentTimeMillis() - inicioSacar;

        System.out.println("Demora en sacar: " + tiempoSacar + " ms");

        long total = tiempoAgregar + tiempoSacar;

        System.out.println("Total agregar y sacar juntos: " + total + " ms");
    }

    public static void experimentarStack(int cantElementos,Stack<Integer> stack, String nombre) {
        long inicioAgregar = System.currentTimeMillis();

        for (int i = 0; i < cantElementos; ++i) {
            stack.push(i);
        }

        long tiempoAgregar = System.currentTimeMillis() - inicioAgregar;

        System.out.println("\n"+nombre+": ");
        System.out.println("Demora en agregar: " + tiempoAgregar + " ms");

        long inicioSacar = System.currentTimeMillis();
        try {
            while (!stack.isEmpty()) {
                stack.pop();
            }
        } catch (Exception e) {
            System.out.println("Error!");
        }

        long tiempoSacar = System.currentTimeMillis() - inicioSacar;

        System.out.println("Demora en sacar: " + tiempoSacar + " ms");

        long total = tiempoAgregar + tiempoSacar;

        System.out.println("Total agregar y sacar juntos: " + total + " ms");
    }
}
