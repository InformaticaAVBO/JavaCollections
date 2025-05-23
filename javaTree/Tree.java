public class Tree<T extends Comparable<T>> {
    
    Nodo<T> root;

    public Tree() {
        this.root = null;
    }

    public void add(T value){
        
        Nodo<T> newNode = new Nodo<>(value);

        if(root == null){
            root = newNode;
            return;
        }

        Nodo<T> tmp = root;
        while (true) {
            if (value.compareTo(tmp.getValue()) >= 0) {
                if (tmp.getRight() == null) {
                    tmp.setRight(newNode);
                    break;
                } else {
                    tmp = tmp.getRight();
                }
            } else {
                if (tmp.getLeft() == null) {
                    tmp.setLeft(newNode);
                    break;
                } else {
                    tmp = tmp.getLeft();
                }
            }
        }
    }

    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        visita(root, sb);
        return sb.toString();
    }
    private void visita(Nodo<T> n, StringBuffer s){
        if(n == null) return;
        if(n.getLeft()!= null) visita(n.getLeft(), s);
        s.append(n.getValue());
        if(n.getRight()!= null) visita(n.getRight(), s);
    }
    
}
