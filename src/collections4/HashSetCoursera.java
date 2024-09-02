package collections4;
import java.util.HashSet;

public class HashSetCoursera {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.add(100);
        set1.add(200);
        set1.add(300);
        set1.add(400);
        set1.add(500);

        System.out.println(set1);
        System.out.println("El Set contiene:100, True or False: " + set1.contains(100));
    }
}
