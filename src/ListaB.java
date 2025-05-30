public class ListaB<T> extends Lista<T> {

    private static class NodoB<T> {
        T dato;
        NodoB<T> next;
        NodoB<T> prev;

        NodoB(T dato) {
            this.dato = dato;
            this.next = null;
            this.prev = null;
        }
    }

    private NodoB<T> root;
    private NodoB<T> coda;
    private int size;

    public ListaB() {
        root = null;
        coda = null;
        size = 0;
    }

    public void aggiungiInroot(T dato) {
        NodoB<T> nuovo = new NodoB<>(dato);
        if (root == null) {
            root = coda = nuovo;
        } else {
            nuovo.next = root;
            root.prev = nuovo;
            root = nuovo;
        }
        size++;
    }

    public void aggiungiInCoda(T dato) {
        NodoB<T> nuovo = new NodoB<>(dato);
        if (coda == null) {
            root = coda = nuovo;
        } else {
            coda.next = nuovo;
            nuovo.prev = coda;
            coda = nuovo;
        }
        size++;
    }

    public T rimuoviDallaroot() {
        if (root == null) return null;
        T dato = root.dato;
        root = root.next;
        if (root != null) {
            root.prev = null;
        } else {
            coda = null;
        }
        size--;
        return dato;
    }

    public T rimuoviDallaCoda() {
        if (coda == null) return null;
        T dato = coda.dato;
        coda = coda.prev;
        if (coda != null) {
            coda.next = null;
        } else {
            root = null;
        }
        size--;
        return dato;
    }
    

public boolean cercaDato(T dato) {
    NodoB<T> corrente = root;
    while (corrente != null) {
        if ((corrente.dato == null && dato == null) || (corrente.dato != null && corrente.dato.equals(dato))) {
            return true;
        }
        corrente = corrente.next;
    }
    return false;
}

    public int size() {
        return size;
    }
}