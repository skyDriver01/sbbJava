package objektOriented.aufg1.streamBasics;

import objektOriented.aufg1.aufg2.InputIn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class aufg1 {
    public static void main(String[] args) {
        List<Integer> numberList = addNumbers();
        System.out.println("This is the Sorted List" + numberList.stream().sorted().toList());
        System.out.println("This is the Unsorted List" + numberList);
    }

    private static List<Integer> addNumbers() {
        List<Integer> numberList = new ArrayList<>();
        int x;
        System.out.println("Type some numbers as you want");
        String[] numbers = InputIn.nextLine().split("\\s+");

        return Arrays.stream(numbers)
                .map(n -> Integer.valueOf(n))
                .toList();


    }
}
