package collections;
import java.util.List;
import java.util.LinkedList;

public class LinkedListCoursera {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<String>();
        System.out.println(linkedList.size());
        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("C#");
        linkedList.add("JavaScript");
        System.out.println(linkedList.size());
        System.out.println(linkedList);

    }
}
