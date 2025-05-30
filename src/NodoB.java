public class NodoB<T> {

    protected T valore;
    protected NodoB<T> succ;
    protected NodoB<T> prev;

    // costruttore 1
    public NodoB() {
        valore = null;
        succ = prev = null;
    }
    // costruttore 2
    public NodoB( T v ) {
        super();
        valore = v;
    }

    @Override
    public String toString() {
        return valore.toString();
    }

    // getter del valore di un nodo
    public T getValore() {
        return valore;
    }
    // setter del valore di un nodo
    public void setValore(T valore) {
        this.valore = valore;
    }

    // getter del nodo seguente di un nodo
    public NodoB<T> getSucc() {
        return succ;
    }
    // getter del nodo precedente di un nodo
    public NodoB<T> getPrev() {
        return prev;
    }

    // setter del nodo successivo di un nodo
    public void setSucc(NodoB<T> succ) {
        this.succ = succ;
    }
    // setter del nodo precedente di un nodo
    public void setPrev(NodoB<T> prev) {
        this.prev = prev;
    }
}