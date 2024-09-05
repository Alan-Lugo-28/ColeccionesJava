package collections4;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashSetCoursera {
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>();
        array1.add(100);
        array1.add(200);
        array1.add(300);
        System.out.println(array1);

        LinkedHashSet<Integer> link = new LinkedHashSet<Integer>(array1);
        System.out.println(link );
        link.add(400);
        link.add(500);
        System.out.println(link);
    }
}
