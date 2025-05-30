public class Main {

    public static void main(String[] args) {
        ListaB<Integer> lista = new ListaB<>();

        lista.addHead(2);
        lista.addTail(4);
        lista.addPosition(1, 3);
        lista.printList(); // 2 <-> 3 <-> 4 <-> null

        lista.removePosition(1);
        lista.printList(); // 2 <-> 4 <-> null

        System.out.println("Esiste 4? " + lista.exists(4)); // true
        System.out.println("Lunghezza: " + lista.getLength()); // 2
    }

}
