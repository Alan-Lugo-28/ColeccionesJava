package collections3;
import java.util.NavigableMap;
import java.util.TreeMap;


public class NavigableMapCoursera {
    public static void main(String[] args) {
        NavigableMap<Integer,String> nav = new TreeMap<>();
        nav.put(1,"Alan");
        nav.put(2,"Pepe");
        nav.put(3,"Paca");
        nav.put(4,"Patita");
        nav.put(5,"Broly");
        System.out.println(nav);
        System.out.println("Devuleve el numero menor a este, pero el mas grande: "+nav.lowerKey(3));
        System.out.println("Devuelve el meonr o el igual: " + nav.ceilingKey(4));
        System.out.println(nav.floorKey(3));
        System.out.println("Me da el mayor pero el mas pequeño: "+nav.higherKey(4));
        System.out.println("Muestra y elimina el primer elemento: "+nav.pollFirstEntry());
        System.out.println(nav);//Drop elemento to Map
        System.out.println("Muestra y elimina el ultimo elemento: "+nav.pollLastEntry());
        System.out.println(nav);
        System.out.println(nav.descendingMap());

    }
}
