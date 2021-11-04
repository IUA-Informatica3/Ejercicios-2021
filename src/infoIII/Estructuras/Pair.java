package infoIII.Estructuras;

public class Pair<K extends Comparable<K>,T> implements Comparable<Pair<K,T> > {
    K clave;
    T valor;

    public Pair(K clave, T valor) {
        this.clave = clave;
        this.valor = valor;
    }

    public K getClave() {
        return clave;
    }

    public void setClave(K clave) {
        this.clave = clave;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "clave=" + clave +
                ", valor=" + valor +
                '}';
    }

    @Override
    public int compareTo(Pair<K, T> ktPair) {
        return clave.compareTo(ktPair.getClave());
    }
}
