package collections4;
import java.util.EnumSet;

public class EnumSetCoursera {

    enum Size{
        SMALL,MEDIUM,LARGUE,EXTRALARGUE
    }

    public static void main(String[] args) {
        EnumSet<Size> sizes = EnumSet.allOf(Size.class );
        System.out.println(sizes);
    }
}
