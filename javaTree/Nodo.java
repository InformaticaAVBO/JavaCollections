public class Nodo<T> {
    T value;
    Nodo<T> left, right;

    public Nodo(T value){
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public Nodo<T> getLeft() {
        return left;
    }
    public void setLeft(Nodo<T> left) {
        this.left = left;
    }
    public Nodo<T> getRight() {
        return right;
    }
    public void setRight(Nodo<T> right) {
        this.right = right;
    }
    
    @Override
    public String toString() {
        return "Nodo [value=" + value + "]";
    }

    
    
}