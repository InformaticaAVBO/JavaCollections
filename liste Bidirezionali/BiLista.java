public class BiLista<T> {
    BiNodo<T> first, last;

    public BiLista(){
        first = last = null;
    }

    public int getSize(){

        int size = 1;
        BiNodo<T> tmp = first;

        while(tmp.getSucc() != null){
            size++;
            tmp = tmp.getSucc();
        }

        return size;
    }

    public void add(T value){
        BiNodo<T> newnodo = new BiNodo<>(value);
        BiNodo<T> tmp = first;
        while(tmp.getSucc() != null) tmp = tmp.getSucc();
        tmp.setSucc(newnodo);
        newnodo.setPrev(tmp);
        last = newnodo;
    }

    public void addHead(T value){
        BiNodo<T> newnodo = new BiNodo<>(value);
        if(first == null){ first = newnodo; last = newnodo; }
        else{
            first.setPrev(newnodo);
            newnodo.setSucc(first);
            first = newnodo;
        }
    }

    @Override
    public String toString() {
        return "BiLista [first=" + first + "]";
    }

    public String toStringReversed(){
        String s = "";
        BiNodo<T> tmp = last;
        while(tmp.getPrev() != null){
            s += tmp.getValue();
            tmp = tmp.getPrev();
        }
        return s;
    }
}
