package collections3;

import java.util.TreeMap;

public class TreeeMapCoursera {
    public static void main(String[] args) {
        TreeMap<Integer,String> tree = new TreeMap<>();
        tree.put(1,"Alan");
        tree.put(2,"Pepe");
        tree.put(3,"Jose");
        tree.put(4,"Israel");
        System.out.println(tree);
        System.out.println(tree.firstKey());
        System.out.println(tree.lastKey());
        System.out.println("Da los menores a: "+tree.lastKey()+" " + tree.headMap(4));
        System.out.println("Da los mayores a: "+tree.firstKey()+" " + tree.tailMap(1));
        System.out.println(tree.subMap(1,4));
    }
}
