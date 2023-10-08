import java.util.ArrayList;
import java.util.List;

public class Vertice {

    List<Integer> adjacentes = new ArrayList<Integer>();
    Integer id;

    public Vertice(Integer _id) {
        id = _id;
    }

    public void addAdjacente(Integer a) {
        adjacentes.add(a);
    }

    public void delAdjacente(Integer a) {
        adjacentes.remove(a);
    }

    public boolean findAdjacente(Integer a) {
        return adjacentes.contains(a);
    }
}
