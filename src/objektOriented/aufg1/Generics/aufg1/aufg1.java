package objektOriented.aufg1.Generics.aufg1;

public class aufg1 {
    static Double[] doubleArray = {1.1, 1.2, 1.3, 1.4, 1.5};
    static Integer[] intArray = {1, 2, 3, 4, 5};
    static String[] stringArray = {"Eins", "Zwei", "Drei", "Vier", "Fünf"};
    public static void main(String[] args) {
        arraysPrint(doubleArray);
        arraysPrint(intArray);
        arraysPrint(stringArray);
    }

    private static void array() {

    }

    public static <T> void arraysPrint(T[] array) {
        for (T element : array){
            System.out.println(element);
        }
    }
}