package collections3;

import java.util.WeakHashMap;

public class weakHashMap {
    public static void main(String[] args) {
        WeakHashMap<Integer,String> weak = new WeakHashMap<>();
        weak.put(1,"Licenciado pene");
        weak.put(2,"Potasio");
        weak.put(3,"Paparazi");
        System.out.println(weak);
        System.out.println(weak.keySet());
        System.out.println(weak.values());
        System.out.println(weak.containsKey(1));
        System.out.println(weak.containsValue("Potasio"));
        Integer numero = 4;
        String nombre = "Pedrito sola";
        weak.put(numero,nombre);
        System.out.println(weak);
        System.out.println(weak.entrySet());

    }
}
