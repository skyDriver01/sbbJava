package reflection;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("reflection.Person");
            Constructor<?> constructor = clazz.getDeclaredConstructor(String.class, Integer.TYPE);
            constructor.getAnnotation(PersonalData.class);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}