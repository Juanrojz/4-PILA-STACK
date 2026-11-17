public class Main {

    public static void main(String[] args) {
        ArrayStack pil = new ArrayStack(5);

        System.out.println("Vacia: " + pil.isEmpty());

        pil.push(99);
        pil.push(250);
        pil.push(301);
        System.out.println("Pila: " + pil);
        System.out.println("Tamano: " + pil.size());
        System.out.println("Peek: " + pil.peek());

        System.out.println("Busca 250: " + pil.search(250));
        System.out.println("Busca 99: " + pil.search(99));

        System.out.println("Pop: " + pil.pop());
        System.out.println("Pila: " + pil);
        System.out.println("Tamano: " + pil.size());

        pil.clear();
        System.out.println("Despues de clear: " + pil);
        System.out.println("Vacia: " + pil.isEmpty());
        System.out.println("Pop en vacia: " + pil.pop());
        System.out.println("Peek en vacia: " + pil.peek());
    }

}