//add head/tail, remove tail/head, add position, remove position, get length.
public class ListaB<T> {
    private static class Nodo<T> {
        T dato;
        Nodo<T> next;
        Nodo<T> prev;

        Nodo(T dato) {
            this.dato = dato;
        }
    }

    private Nodo<T> root;
    private Nodo<T> coda;
    private int size = 0;

   
    public void aggiungiroot(T dato) {
        Nodo<T> nuovo = new Nodo<>(dato);
        if (root == null) {
            root = coda = nuovo;
        } else {
            nuovo.next = root;
            root.prev = nuovo;
            root = nuovo;
        }
       
    }

    
    public void aggiungiCoda(T dato) {
        Nodo<T> nuovo = new Nodo<>(dato);
        if (coda == null) {
            root = coda = nuovo;
        } else {
            coda.next = nuovo;
            nuovo.prev = coda;
            coda = nuovo;
        }
       
    }


    public void aggiungiPosizione(int pos, T dato) {
        if (pos < 0 || pos > size) throw new IndexOutOfBoundsException();
        if (pos == 0) {
            aggiungiroot(dato);
        } else if (pos == size) {
            aggiungiCoda(dato);
        } else {
            Nodo<T> tmp = root;
            for (int i = 0; i < pos - 1; i++) {
                tmp = tmp.next;
            }
            Nodo<T> nuovo = new Nodo<>(dato);
            nuovo.next = tmp.next;
            nuovo.prev = tmp;
            tmp.next.prev = nuovo;
            tmp.next = nuovo;
           
        }
    }

    public T rimuoviroot() {
        if (root == null) return null;
        T dato = root.dato;
        root = root.next;
        if (root != null) {
            root.prev = null;
        } else {
            coda = null;
        }
        
        return dato;
    }

    public T rimuoviCoda() {
        if (coda == null) return null;
        T dato = coda.dato;
        coda = coda.prev;
        if (coda != null) {
            coda.next = null;
        } else {
            root = null;
        }
      
        return dato;
    }

    public T rimuoviPosizione(int pos) {
        if (pos < 0 || pos >= size) throw new IndexOutOfBoundsException();
        if (pos == 0) return rimuoviroot();
        if (pos == size - 1) return rimuoviCoda();
        Nodo<T> tmp = root;
        for (int i = 0; i < pos; i++) {
            tmp = tmp.next;
        }
        T dato = tmp.dato;
        tmp.prev.next = tmp.next;
        tmp.next.prev = tmp.prev;

        return dato;
    }

     public int getSize(){
        int size=0;
        Nodo<T> temp=root;
        while(temp !=null){
            size++;
            temp=temp.getSucc();
                }
                return size;
    }

    public void stampaAvanti() {
        Nodo<T> tmp = root;
        while (tmp != null) {
            System.out.print(tmp.dato + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    
    public void stampaIndietro() {
        Nodo<T> tmp = coda;
        while (tmp != null) {
            System.out.print(tmp.dato + " ");
            tmp = tmp.prev;
        }
        System.out.println();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Nodo<T> tmp = root;
        while (tmp != null) {
            sb.append(tmp.dato);
            if (tmp.next != null) sb.append(", ");
            tmp = tmp.next;
        }
        sb.append("]");
        return sb.toString();
    }
}