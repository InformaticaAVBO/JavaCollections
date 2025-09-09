public class ListaBi<T> {

    private Nodobi<T> root;
    private Nodobi<T> tail;
    protected Nodobi<T> last;
    private Nodobi<T> head;

    public ListaBi() {
        this.root = this.tail = this.last = this.head = null;
    }

    public void add(NodoBi<T> newnode) {
        if (root == null) {
            root = newnode;
            tail = newnode;
        } else {
            tail.setSucc(newnode);
            newnode.setPrec(tail);
            tail = newnode;
        }
    }

    public void add(T newval) {
        NodoBi<T> newnode = new NodoBi<>(newval);
        this.add(newnode);
    }

    public void addHead(T newval) {
        NodoBi<T> nuovonodo = new NodoBi<>(newval);
        if (root == null) {
            root = tail = nuovonodo;
        } else {
            nuovonodo.setSucc(root);
            root.setPrec(nuovonodo);
            root = nuovonodo;
        }
    }

    public void addAtposition(T newval, int position) {
        NodoBi<T> newnode = new NodoBi<>(newval);

        if (position <= 0 || root == null) {
            addHead(newval);
            return;
        }

        NodoBi<T> tmp = root;
        int index = 0;

        while (tmp != null && index < position - 1) {
            tmp = tmp.getSucc();
            index++;
        }

        if (tmp == null) {
            add(newval);
        } else {
            newnode.setSucc(tmp.getSucc());
            if (tmp.getSucc() != null) {
                tmp.getSucc().setPrec(newnode);
            }
            newnode.setPrec(tmp);
            tmp.setSucc(newnode);
            
            if (newnode.getSucc() == null) {
                tail = newnode;
            }
        }
    }



    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Lista: ");
        NodoBi<T> tmp = root;
        while (tmp != null) {
            result.append(" <--> ").append(tmp);
            tmp = tmp.getSucc();
        }
        return result.toString();
    }
}
