package objektOriented.aufg1.Generics.aufg2;

import java.util.ArrayList;
import java.util.List;

public class NumberList<T> {
    static List <Double> doubleList = new ArrayList <>();
    static List <Integer> intList = new ArrayList <>();

    public static <T> void lists(T[] element) {
        addToIntList();
        for (int i = 0; i < 8; i++) {
            doubleList.add(Math.random() * (1 - 100) + 100);
        }

        System.out.println(doubleList.toString());
        System.out.println(intList.toString());
    }

    private static void addToIntList() {
        intList.add(23);
        intList.add(50);
        intList.add(1);
        intList.add(87);
        intList.add(62);
        intList.add(78);
        intList.add(90);
        intList.add(18);
    }
}