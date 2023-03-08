package annotation.aufg1;

public class AnnotationTest {
    public static void main(String[] args) {
        Documentation documentation = Publisher.class.getAnnotation(Documentation.class);
        System.out.println(Publisher.class.getName());
        System.out.println(documentation.name());
        System.out.println(documentation.description());
        System.out.println(documentation.version());
    }
}