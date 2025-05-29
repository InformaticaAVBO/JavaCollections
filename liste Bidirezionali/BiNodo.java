public class BiNodo<T> {
    T value;
    BiNodo<T> prev, succ;
    
    public BiNodo(){
        value = null;
        prev = succ = null;
    }
    public BiNodo(T value){
        super();
        this.value = value;
    }

    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public BiNodo<T> getPrev() {
        return prev;
    }
    public void setPrev(BiNodo<T> prev) {
        this.prev = prev;
    }
    public BiNodo<T> getSucc() {
        return succ;
    }
    public void setSucc(BiNodo<T> succ) {
        this.succ = succ;
    }

    @Override
    public String toString() {
        return "BiNodo [value=" + value + "]";
    }

    
}