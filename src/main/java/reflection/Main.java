package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) {
        Constructor <?> constructor = null;
        Class <?> clazz = main.java.reflection.Person.class;
        try {
            constructor = clazz.getDeclaredConstructor(String.class, int.class);
        } catch (NoSuchMethodException | ClassCastException e) {
            System.out.println("Smth aint worked");
        }
        assert constructor != null;
        main.java.reflection.PersonalData personalData = constructor.getAnnotation(main.java.reflection.PersonalData.class);
        String[] personNames = personalData.names();
        int[] personAges = personalData.ages();
        for (int i = 0; i < personAges.length; i++) {
            try {
                Object o = constructor.newInstance(personNames[i], personAges[i]);
                System.out.println(o);
            } catch (InstantiationException | InvocationTargetException | IllegalAccessException b) {
                System.out.println("It wont allow the instance");
                throw new RuntimeException(b);
            }
        }

    }
}