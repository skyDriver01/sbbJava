package objektOriented.aufg1.Generics.aufg2;

import java.util.ArrayList;
import java.util.List;

public class NumberList<T extends Comparable> {

    private List <T> list = new ArrayList <>();

    public void addElements(T... elements) {
        list.addAll(List.of(elements));
    }

    public T getBiggest() {
        return list
                .stream()
                .max((a, b) -> a.compareTo(b))
                .orElse(null);

    }

    public T getSmallest() {
        return list
                .stream()
                .min((a, b) -> a.compareTo(b))
                .orElse(null);
    }


    public void lists() {
        Integer[] ints = new Integer[]{1, 1343, 4, 5345, 6, 7, 8, 54, 3, 3, 2, 1, 67, 57, 4, 5, 74, 3};
        List <Integer> numberList = List.of(ints);
        NumberList <Integer> intList = new NumberList <>();
        intList.addElements(numberList
                                    .stream()
                                    .toArray(Integer[]::new));
        int biggest = intList.getBiggest();
        int smallest = intList.getSmallest();
        System.out.println("Biggest Int: " + biggest);
        System.out.println("Smallest Int: " + smallest);
        //--------------------------------------------------------

        Double[] doubles = new Double[]{1.4, 123.5, 3612.451543212415681516845135, 123.54, 534.62, 546.561561241, 2.3, 4.34, 2.8, 6.8, 86.7, 3.4, 2.57, 343.534, 537.66, 3989797.7, 47.789, 6.57};
        List <Double> doubleNumberList = List.of(doubles);
        NumberList <Double> doubleList = new NumberList <>();
        doubleList.addElements(doubleNumberList
                                       .stream()
                                       .toArray(Double[]::new));
        System.out.println(numberList);
    }
}