package collections4;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableHashSet {
    public static void main(String[] args) {
        NavigableSet<Integer> nav = new TreeSet<Integer>();
        nav.add(10);
        nav.add(20);
        nav.add(30);
        nav.add(40);
        nav.add(50);
        System.out.println(nav);

        NavigableSet<Integer> reverseSet = nav.descendingSet();
        System.out.println(reverseSet);

    }
}
