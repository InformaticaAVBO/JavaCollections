public class NodoB<T> {

    private T dato;
    private NodoB<T> succ;
    private NodoB<T> prev;

    public NodoB() {
        dato = null;
        succ = null;
        prev = null;
    }

    public NodoB(T dato) {
        this.dato = dato;
        this.succ = null;
        this.prev = null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoB<T> getSucc() {
        return succ;
    }

    public void setSucc(NodoB<T> succ) {
        this.succ = succ;
    }

    public NodoB<T> getPrev() {
        return prev;
    }

    public void setPrev(NodoB<T> prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return dato.toString();
    }
}