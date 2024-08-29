package collections;

import java.util.Vector;

public class VectorCoursera {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();
        System.out.println(vector.size());
        vector.add("Java");
        vector.add("Python");
        vector.add("C++");
        System.out.println( vector.size());
        System.out.println(vector);
        vector.remove(2);
        System.out.println(vector);
    }
}
