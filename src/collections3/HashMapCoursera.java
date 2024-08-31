package collections3;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapCoursera {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        System.out.println(map);
        map.put(1,"Hola perra");
        map.put(null,"Gate");
        map.put(2,"Hola mundo");
        map.put(null,"Perre");
        System.out.println(map);
        System.out.println(map.entrySet());
        System.out.println(map.get(1));
        System.out.println(map.containsValue("Hola perra"));
        map.remove(null);
        System.out.println(map.isEmpty());
        map.clear();
        System.out.println(map.entrySet());


    }
}
