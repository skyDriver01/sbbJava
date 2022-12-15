package objektOriented.aufg1.Generics.aufg2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class NumberList<T> {

    public void lists() {
        List <T> numberList = new ArrayList <>();

        for (int i = 0; i < 2; i++) {
            IntStream ints = numberList
                    .stream()
                    .mapToInt(n -> (int) (Math.random() * 100));
            DoubleStream doubles = numberList
                    .stream()
                    .mapToDouble(n -> Math.random() * (1 - 100) + 100);
            numberList.add((T) ints.boxed().toList());
            numberList.add((T) doubles.boxed().toList());
            //* 100 weil es die zahlen rundet nachdem es randoms findet und ohne das *100 sind alle zahlen einfach 0
        }
        System.out.println(numberList);
    }

    public static void getBiggestAndSmallestNumber() {

    }
}