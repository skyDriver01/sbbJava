package main.java.objektOriented.aufg1.Generics.aufg1;

public class aufg1 {
    final static Double[] doubleArray = {1.1, 1.2, 1.3, 1.4, 1.5};
    final static Integer[] intArray = {1, 2, 3, 4, 5};
    final static String[] stringArray = {"Eins", "Zwei", "Drei", "Vier", "Fünf"};

    public static void main(String[] args) {
        arraysPrint(doubleArray);
        arraysPrint(intArray);
        arraysPrint(stringArray);
    }

    public static <E> void arraysPrint(E[] array) {
        for (E element : array) {
            System.out.println(element);
        }
    }
}