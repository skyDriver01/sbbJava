package objektOriented.aufg1.Generics.aufg2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class NumberList<T> {
    List <T> numberList = new ArrayList <>();

    public void lists() {
        for (int i = 0; i <= 1; i++) {
            IntStream ints = numberList
                    .stream()
                    .mapToInt(n -> (int) (Math.random() * 100));  // * 100 weil es die zahlen rundet nachdem es randoms findet und ohne das *100 sind alle zahlen einfach 0
            DoubleStream doubles = numberList
                    .stream()
                    .mapToDouble(n -> Math.random() * (1 - 100) + 100);
            numberList.add((T) ints
                    .boxed()
                    .toList());
            numberList.add((T) doubles
                    .boxed()
                    .toList());

        }
        System.out.println(numberList);
    }

    public void getBiggestAndSmallestNumber() {
    }
}
/*
            IntStream ints = numberList
                    .stream()
                    .mapToInt(n -> (int) (Math.random() * 100));  // * 100 weil es die zahlen rundet nachdem es randoms findet und ohne das *100 sind alle zahlen einfach 0
            DoubleStream doubles = numberList
                    .stream()
                    .mapToDouble(n -> Math.random() * (1 - 100) + 100);
            numberList.add((T) ints
                    .boxed()
                    .toList());
            numberList.add((T) doubles
                    .boxed()
                    .toList());
 */