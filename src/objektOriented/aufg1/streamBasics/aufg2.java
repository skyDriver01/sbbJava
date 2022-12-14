package objektOriented.aufg1.streamBasics;

import objektOriented.aufg1.aufg2.InputIn;

import java.util.ArrayList;
import java.util.List;

public class aufg2 {
    public static void main(String[] args) {
        List<Integer>numberList = addNumbers();
        originalList(numberList);
        multipliedList(numberList);
    }

    private static void originalList(List<Integer> numberList) {
        System.out.println("The unsorted List without all numbers multiplied with themselves: " + numberList);
        System.out.println("The sorted List without all numbers multiplied with themselves: " + numberList.stream().sorted().toList());
    }

    private static List<Integer> addNumbers() {
        List<Integer> numberList = new ArrayList<>();
        int x;
        System.out.println("Type some numbers as you want");
        String[] numbers = InputIn.nextLine().split("\\s+");
        for (String number : numbers){
            x = Integer.parseInt(number);
            numberList.add(x);
        }
        return numberList;
    }
    private static void multipliedList(List<Integer> numberList){
        for (int i = 0; i < numberList.size(); i++) {
            numberList.add(numberList.get(i) * numberList.get(i));
        }
        System.out.println("The unsorted List with all numbers factored by 2: " + numberList);
        System.out.println("The sorted List with all numbers factored by 2: " + numberList); //TODO: is stuck in an infinite loop find cause
    }

}
