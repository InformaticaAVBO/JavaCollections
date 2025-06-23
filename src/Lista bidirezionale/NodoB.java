public class NodoB<T> {
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

    public NodoB<T> getSucc() {
        return succ;
    }

    public void setSucc(NodoB<T> succ) {
        this.succ = succ;
    }

    public T getValore() {
        return valore;
    }

    public void setValore(T valore) {
        this.valore = valore;
    }
}
