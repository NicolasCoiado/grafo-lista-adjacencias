import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Grafo.addVertice(1);
        Grafo.addVertice(2);
        Grafo.addVertice(3);

        Grafo.addAresta(1, 2);
        Grafo.addAresta(2, 3);
        Grafo.addAresta(3, 1);

        System.out.println(Grafo.verificarAresta(1, 2));
        System.out.println(Grafo.verificarAresta(2, 3));
        System.out.println(Grafo.verificarAresta(3, 1));
        System.out.println(Grafo.verificarAresta(5, 7));
    }
}