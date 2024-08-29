package string;

public class StringBUfferCoursera {

    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello ");
        System.out.println(buffer);
        buffer.append("World");
        System.out.println(buffer);
        buffer.insert(buffer.length()," alan");
        System.out.println(buffer);
        buffer.delete(buffer.length()-5,buffer.length());
        System.out.println(buffer);

        System.out.println("+++++++++++++++++++++++++++");
        StringBuilder builder = new StringBuilder("Hello ");
        System.out.println(builder);
        System.out.println(builder.capacity());
        builder.append("World");
        System.out.println(builder);
    }

}
