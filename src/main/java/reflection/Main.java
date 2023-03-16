package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) {
        Constructor <?> constructor = null;
        Class <?> clazz = reflection.Person.class;
        try {
            constructor = clazz.getDeclaredConstructor(String.class, int.class);
        } catch (NoSuchMethodException | ClassCastException e) {
            System.out.println("seems it didnt find the method but here to know better: " + e);
        }
        assert constructor != null;
        reflection.PersonalData personalData = constructor.getAnnotation(reflection.PersonalData.class);
        String[] personNames = personalData.names();
        int[] personAges = personalData.ages();
        for (int i = 0; i < personAges.length; i++) {
            try {
                Object o = constructor.newInstance(personNames[i], personAges[i]);
                System.out.println(o);
            } catch (InstantiationException | InvocationTargetException | IllegalAccessException b) {
                System.out.println("It wont allow the instance" + b);
            }
        }

    }
}