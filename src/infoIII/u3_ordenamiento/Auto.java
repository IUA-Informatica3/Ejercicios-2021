package infoIII.u3_ordenamiento;

/**
 * Example class used for sorting implementing Comparable.
 */
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
