public class ListaB<T> {
    private static class Nodo<T> {
        private T valore;
        private Nodo<T> precedente;
        private Nodo<T> successivo;

        Nodo(T valore) {
            this.valore = valore;
        }
    }
    

    private Nodo<T> testa;
    private Nodo<T> coda;
    private int size = 0;  // Per mantenere la lunghezza aggiornata

    public void add(T elemento) {
        Nodo<T> nuovoNodo = new Nodo<>(elemento);
        if (testa == null) {
            testa = nuovoNodo;
            coda = nuovoNodo;
        } else {
            coda.successivo = nuovoNodo;
            nuovoNodo.precedente = coda;
            coda = nuovoNodo;
        }
        size++;
    }

    public void addHead(T elemento) {
        Nodo<T> nuovoNodo = new Nodo<>(elemento);
        if (testa == null) {
            testa = nuovoNodo;
            coda = nuovoNodo;
        } else {
            nuovoNodo.successivo = testa;
            testa.precedente = nuovoNodo;
            testa = nuovoNodo;
        }
        size++;
    }

    public void addTail(T elemento) {
        add(elemento);
    }

    public int getLength() {
        return size;
    }

    public void removeHead() {
        if (testa == null) return;
        if (testa == coda) {
            testa = null;
            coda = null;
        } else {
            testa = testa.successivo;
            testa.precedente = null;
        }
        size--;
    }

    public void removeTail() {
        if (coda == null) return;
        if (testa == coda) {
            testa = null;
            coda = null;
        } else {
            coda = coda.precedente;
            coda.successivo = null;
        }
        size--;
    }
}
