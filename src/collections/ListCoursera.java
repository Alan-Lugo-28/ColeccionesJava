package collections;
import java.util.ArrayList;
import java.util.List;

public class ListCoursera {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();
        List<String> listaCLone = new ArrayList<String>();

        lista.add("King");
        lista.add("Queen");
        lista.add("Alan");
        System.out.println(lista);

        lista.add(0,"NumberOne");
        System.out.println(lista);

    }
}
