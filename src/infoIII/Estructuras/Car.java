package infoIII.Estructuras;

public class Car implements Comparable<Car> {
    String patente;
    String marca;
    String modelo;
    int kilometraje;

    public Car(String patente, String marca, String modelo, int kilometraje) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }

    @Override
    public String toString() {
        return patente + " - " + modelo + " - " + marca;
    }

    @Override
    public int compareTo(Car car) {
        return patente.compareTo(car.patente);
    }
}
