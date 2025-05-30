public class ListaB<T> {
    private NodoB<T> testa;
    private NodoB<T> coda;
    public ListaB() {
        this.testa = null;
        this.coda = null;
    }
    public void aggiungiInTesta(T valore) {
        NodoB<T> nuovoNodo = new NodoB<>(valore);
        if (testa == null) {
            testa = nuovoNodo;
            coda = nuovoNodo;
        } else {
            nuovoNodo.setPrec(null);
            nuovoNodo.setSucc(testa);
            testa.setPrec(nuovoNodo);
            testa = nuovoNodo;
        }
    }
}