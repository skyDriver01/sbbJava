package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) {
        Constructor <?> constructor = null;
        Class <?> clazz = Person.class;
        try {
            constructor = clazz.getDeclaredConstructor(String.class, int.class);
        } catch (NoSuchMethodException | ClassCastException e) {
            System.out.println("Smth aint worked");
        }
        assert constructor != null;
        PersonalData personalData = constructor.getAnnotation(PersonalData.class);
        String[] personNames = personalData.names();
        int[] personAges = personalData.ages();
        for (int i = 0; i < personAges.length; i++) {
            try {
                constructor.newInstance(personNames[i], personAges[i]);
            }catch (InstantiationException | InvocationTargetException | IllegalAccessException e){
                System.out.println("It wont allow the instance");
                throw  new RuntimeException(e);
            }
            System.out.println(personNames[i]);
            System.out.println(personAges[i]);
        }
    }
}