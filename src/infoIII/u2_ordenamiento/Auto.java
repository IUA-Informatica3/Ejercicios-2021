package infoIII.u2_ordenamiento;

public class Auto implements Comparable<Auto> {
    String patente;

    public Auto(String patente) {
        this.patente = patente;
    }

    @Override
    public int compareTo(Auto auto) {
        return patente.compareTo(auto.patente);
    }

    @Override
    public String toString() {
        return patente;
    }
}
