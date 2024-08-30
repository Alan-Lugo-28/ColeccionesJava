package collections3;

import java.util.HashMap;
import java.util.Map;

public class MapsCoursera {

    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"Alan");
        map.put(2,"Pepe");
        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        System.out.println(map.isEmpty());
        map.remove(1);
        System.out.println(map);
        for (Map.Entry<Integer,String> a : map.entrySet()){
            System.out.println(a.getKey() + ":" +a.getValue());
        }
        map.clear();
        System.out.println(map);
    }

}
