package reflection;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {
        Constructor<?> constructor = null;
        Class<?> clazz = Person.class;
        try {
            constructor = clazz.getDeclaredConstructor(String.class, int.class);
        } catch (NoSuchMethodException | NullPointerException | ClassCastException e) {
            System.out.println("Smth aint worked");
        }
        assert constructor != null;
        PersonalData personalData = constructor.getAnnotation(PersonalData.class);
        String[] personNames = personalData.names();
        int[] personAges = personalData.ages();
        for (int i = 0; i < personAges.length; i++) {
            System.out.println(personNames[i]);
            System.out.println(personAges[i]);
        }
    }
}