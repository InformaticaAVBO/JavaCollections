public class NodoB<T> extends Nodo<T> {
    protected NodoB<T> prec;
    public NodoB(T valore) {
        super(valore);
        this.prec = null; // Inizializza il nodo precedente a null
    }
    public NodoB<T> getPrec() {
        return prec;
    }
    public void setPrec(NodoB<T> prec) {
        this.prec = prec;
    }
}
