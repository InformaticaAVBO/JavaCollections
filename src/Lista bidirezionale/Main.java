public class Main {
    public static void main(String[] args) {
        ListaB<Integer> lista = new ListaB<>();

        System.out.println("Aggiungo in testa 2");
        lista.addHead(2);     // 2
        lista.printList();

        System.out.println("Aggiungo in coda 4");
        lista.addTail(4);     // 2 <-> 4
        lista.printList();

        System.out.println("Aggiungo in posizione 1 il valore 3");
        lista.addPosition(1, 3);  // 2 <-> 3 <-> 4
        lista.printList();

        System.out.println("Rimuovo dalla posizione 1");
        lista.removePosition(1);  // 2 <-> 4
        lista.printList();

        System.out.println("Esiste il valore 4? " + lista.exists(4)); // true
        System.out.println("Esiste il valore 10? " + lista.exists(10)); // false

        System.out.println("Lunghezza: " + lista.getLength()); // 2

        System.out.println("Rimuovo la testa");
        lista.removeHead();  // 4
        lista.printList();

        System.out.println("Rimuovo la coda");
        lista.removeTail();  // (vuota)
        lista.printList();

        System.out.println("Lunghezza finale: " + lista.getLength()); // 0
    }
}
