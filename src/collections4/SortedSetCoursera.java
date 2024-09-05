package collections4;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetCoursera {
    public static void main(String[] args) {
        SortedSet<String> sorted = new TreeSet<String>();
        sorted.add("Alan");
        sorted.add("Jose");
        sorted.add("Ricardo");
        sorted.add("Reyna");
        sorted.add("Alvaro");
        System.out.println(sorted);
        System.out.println(sorted.first());
        System.out.println(sorted.last());
    }
}
