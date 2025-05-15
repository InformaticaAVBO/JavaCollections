public class App {
    public static void main(String[] args) throws Exception {

        /*
        // test Hello World
        System.out.println("Hello, World!");

        // test MyIntArray
        MyIntArray a = new MyIntArray();
        for (int i=0; i<10; i++) a.add(i);
        System.out.println(a);
        */

        Lista<String> l = new Lista<>();
        l.add("bologna");
        l.add("juventus");
        l.addHead("ciaoo");
        System.out.println(l);
        


    }
}
