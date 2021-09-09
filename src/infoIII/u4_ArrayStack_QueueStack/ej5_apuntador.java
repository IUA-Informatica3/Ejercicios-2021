package infoIII.u4_ArrayStack_QueueStack;

import infoIII.Estructuras.ArrayQueue;
import infoIII.Estructuras.Queue;

import java.util.Scanner;

/**
 * Implemente un apuntador de citas usando el concepto
 * de cola implementada mediante el uso de un arreglo.
 */
public class ej5_apuntador {
    public static void main(String[] args) {
        Queue<String> turnero = new ArrayQueue<>();
        Scanner scan = new Scanner(System.in);
        String selected;
        showMenu();
        selected = scan.nextLine();
        while (!selected.equals("0")) {
            switch (selected) {
                case "1":
                    addCita(turnero, scan);
                    break;
                case "2":
                    atenderCita(turnero);
                    break;
                case "3":
                    verCitas(turnero);
                    break;
            }

            showMenu();
            selected = scan.nextLine();
        }
    }

    private static void verCitas(Queue<String> turnero) {
        Queue<String> tmp = new ArrayQueue<>();
        String nombre;
        try {
            while (!turnero.isEmpty()) {
                nombre = turnero.dequeue();
                System.out.println("Turno: " + nombre);
                tmp.enqueue(nombre);
            }

            while (!tmp.isEmpty()) {
                turnero.enqueue(tmp.dequeue());
            }
        }catch (Exception e){
            System.out.println("Error no esperado");
        }
    }

    private static void atenderCita(Queue<String> turnero) {
        System.out.println("Se atendio a:");
        try {
            System.out.println(turnero.dequeue());
        } catch (Exception e) {
            System.out.println("No hay turno agendado");
        }
    }

    private static void addCita(Queue<String> turnero, Scanner scan) {
        System.out.println("Ingrese nombre");
        turnero.enqueue(scan.nextLine());
    }


    private static void showMenu() {
        System.out.println("Menu");
        System.out.println();
        System.out.println("1) Agregar cita");
        System.out.println("2) atender cita");
        System.out.println("3) ver citas pendientes");
        System.out.println("0) Salir");
    }
}
