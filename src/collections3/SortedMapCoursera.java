package collections3;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapCoursera {
    public static void main(String[] args) {
        SortedMap<String,Integer> sorted = new TreeMap<>();
        sorted.put("Alan",1);
        sorted.put("Pepe",2);
        sorted.put("Juanito",3);
        sorted.put("Ana",4);
        System.out.println(sorted.firstKey());
        System.out.println(sorted.lastKey());
        System.out.println(sorted.tailMap("Alan"));
        System.out.println(sorted.headMap("Pepe"));
        System.out.println(sorted.subMap(sorted.firstKey(), sorted.lastKey()));
    }
}
