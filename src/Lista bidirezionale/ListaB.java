public class ListaB<T> {
    private NodoB<T> head;
    private NodoB<T> tail;
    private int size;

    public ListaB() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void addHead(T value) {
        NodoB<T> nuovo = new NodoB<>(value);
        if (head == null) {
            head = tail = nuovo;
        } else {
            nuovo.setSucc(head);
            head.setPrev(nuovo);
            head = nuovo;
        }
        size++;
    }

    public void addTail(T value) {
        NodoB<T> nuovo = new NodoB<>(value);
        if (tail == null) {
            head = tail = nuovo;
        } else {
            tail.setSucc(nuovo);
            nuovo.setPrev(tail);
            tail = nuovo;
        }
        size++;
    }

    public int getLength() {
        return size;
    }

    public boolean exists(T value) {
        NodoB<T> current = head;
        while (current != null) {
            if (current.getValore().equals(value)) return true;
            current = current.getSucc();
        }
        return false;
    }

    public void removeHead() {
        if (head == null) return;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.getSucc();
            head.setPrev(null);
        }
        size--;
    }

    public void removeTail() {
        if (tail == null) return;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.getPrev();
            tail.setSucc(null);
        }
        size--;
    }

    public void addPosition(int pos, T value) {
        if (pos <= 0) {
            addHead(value);
        } else if (pos >= size) {
            addTail(value);
        } else {
            NodoB<T> current = head;
            for (int i = 0; i < pos; i++) {
                current = current.getSucc();
            }
            NodoB<T> nuovo = new NodoB<>(value);
            NodoB<T> prev = current.getPrev();

            nuovo.setPrev(prev);
            nuovo.setSucc(current);
            prev.setSucc(nuovo);
            current.setPrev(nuovo);
            size++;
        }
    }

    public void removePosition(int pos) {
        if (pos < 0 || pos >= size) return;

        if (pos == 0) {
            removeHead();
        } else if (pos == size - 1) {
            removeTail();
        } else {
            NodoB<T> current = head;
            for (int i = 0; i < pos; i++) {
                current = current.getSucc();
            }
            NodoB<T> prev = current.getPrev();
            NodoB<T> succ = current.getSucc();
            prev.setSucc(succ);
            succ.setPrev(prev);
            size--;
        }
    }

    public void printList() {
        NodoB<T> current = head;
        while (current != null) {
            System.out.print(current.getValore() + " <-> ");
            current = current.getSucc();
        }
        System.out.println("null");
    }
}