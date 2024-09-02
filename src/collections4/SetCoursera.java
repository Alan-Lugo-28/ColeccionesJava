
package collections4;
import java.util.HashSet;
import java.util.Set;

public class SetCoursera {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<Integer>();
        System.out.println(set1);
        set1.add(100);
        set1.add(200);
        set1.add(300);
        set1.add(400);
        System.out.println(set1);
        set1.remove(100);
        System.out.println(set1);

    }
}
