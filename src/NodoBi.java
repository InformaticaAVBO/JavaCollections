public class NodoB<T> extends Nodo<T>{

    private T valore;
    protected Nodob<T> succ;
    protected NodoB<T> prec;


    
    public NodoB(T v){
        valore = v;
        succ = prec = null;

    }

    @Override
    public String toString() {
        return valore.toString();
    }

    public T getValore() {
        return valore;
    }

    public void setValore(T valore) {
        this.valore = valore;
    }

    public Nodobi<T> getSucc() {
        return succ;
    }

    public void setSucc(Nodobi<T> succ) {
        this.succ = succ;
        if (succ != null) { 
            succ.setPrec(this);
        }
    }

    public Nodobi<T> getPrec() {
        return prec;
    }

    public void setPrec(Nodobi<T> prec) {
        this.prec = prec;
    }


}