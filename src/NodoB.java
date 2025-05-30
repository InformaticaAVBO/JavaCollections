public class NodoB<T> extends Nodo<T> {

    protected NodoB<T> prev;
    protected T valore;
    protected NodoB<T> succ;

    public NodoB() {
        this.valore = null;
        this.prev = null;
        this.succ = null;
    }

    public NodoB(T valore) {
        this.valore = valore;
        this.prev = null;
        this.succ = null;
    }

    public NodoB<T> getPrev() {
        return prev;
    }

    public void setPrev(NodoB<T> prev) {
        this.prev = prev;
    }

 }