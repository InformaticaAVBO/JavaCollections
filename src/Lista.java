public class Lista<T> {

    protected Nodo<T> root;

    public Lista() {
        root = null;
    }

    public void add(T newval) {
        Nodo<T> newnode = new Nodo<>(newval);
        this.add(newnode);
    }

    public void add(Nodo<T> newnode) {
        if (root==null) {
            root = newnode;
        } else {
            Nodo<T> temp = root;
            while (temp.getSucc()!=null) temp=temp.getSucc();
            temp.setSucc(newnode);
        }
    }


    public void addHead(T newval){
        Nodo<T> newnode = new Nodo<>(newval);
        this.addHead(newnode);
    }
    public void addHead(Nodo<T> newnode){
        Nodo<T> tmp = root;
        root = newnode;
        newnode.setSucc(tmp);
    }

    @Override
    public String toString() {
        String s = "Lista: ";
        Nodo<T> tmp = root;
        while(tmp != null){
            s += tmp + "\n";
            tmp = tmp.getSucc();
        }
        return s;
    }
    
}
