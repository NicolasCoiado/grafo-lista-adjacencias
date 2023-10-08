import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Grafo {

    static List<Vertice> listaAdj = new ArrayList<Vertice>();

    public static void addVertice(Integer v) {
        Vertice newVertice = new Vertice(v);
        listaAdj.add(newVertice);
    }

    public static void delVertice(Integer v) {

        for (int i=0; i<listaAdj.size(); i++) {
            Vertice vertice = listaAdj.get(i);
            if (vertice.id == v) {
                listaAdj.remove(vertice);
            } else {
                vertice.delAdjacente(v);
            }
        }
    }

    public static void addAresta(Integer vA, Integer vB) {

        for (int i=0; i<listaAdj.size(); i++) {
            Vertice vertice = listaAdj.get(i);
            if (vertice.id == vA) {
                vertice.addAdjacente(vB);
            }
            if (vertice.id == vB) {
                vertice.addAdjacente(vA);
            }
        }
    }

    public static void delAresta(Integer vA, Integer vB) {
        for (int i = 0; i < listaAdj.size(); i++) {
            Vertice vertice = listaAdj.get(i);
            if (vertice.id == vA) {
                vertice.delAdjacente(vB);
            }
            if (vertice.id == vB) {
                vertice.delAdjacente(vA);
            }
        }
    }
    public static boolean verificarAresta(Integer vA, Integer vB) {
        for (int i=0; i<listaAdj.size(); i++) {
            Vertice vertice = listaAdj.get(i);
            if (vertice.id == vA) {
                return vertice.findAdjacente(vB);
            }

            if (vertice.id == vB) {
                return vertice.findAdjacente(vA);
            }

        }

        return false;
    }

}