package collections3;

import java.util.EnumMap;

public class EnumMapCoursera {
    public static void main(String[] args) {
        EnumMap<EnumMap1.Size,Integer> sizes;
        sizes = new EnumMap<EnumMap1.Size,Integer>(EnumMap1.Size.class);
        sizes.put(EnumMap1.Size.SMALL,1);
        sizes.put(EnumMap1.Size.MEDIUM,2);
        sizes.put(EnumMap1.Size.LARGE,3);
        sizes.put(EnumMap1.Size.EXTRALARGE,4);

        System.out.println(sizes);
        System.out.println(sizes.entrySet());

    }
}
class EnumMap1 {

    enum Size{
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }

}