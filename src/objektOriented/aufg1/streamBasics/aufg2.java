package objektOriented.aufg1.streamBasics;

import objektOriented.aufg1.aufg2.InputIn;

import java.util.ArrayList;
import java.util.List;

public class aufg2 {
    public static void main(String[] args) {
        List <Integer> numberList = addNumbers();
        originalList(numberList);
        multipliedList(numberList);
    }

    private static void originalList(List <Integer> numberList) {
        System.out.println("The unsorted List without all numbers multiplied with themselves: " + numberList);
        System.out.println("The sorted List without all numbers multiplied with themselves: " + numberList.stream().sorted().toList());
    }

    private static List <Integer> addNumbers() {
        List <Integer> numberList = new ArrayList <>();
        int x;
        System.out.println("Type some numbers as you want");
        String[] numbers = InputIn.nextLine().split("\\s+");
        for (String number : numbers) {
            x = Integer.parseInt(number);
            numberList.add(x);
        }
        return numberList;
    }

    private static List <Integer> multipliedList(List <Integer> numberList) {
        List <Integer> squaredNumbers = new ArrayList <>();
        for (int i = 0; i < numberList.size(); i++) {           //Damit es durch alle zahlen in der Liste geht und sie mal sich selber geaddet in eine neue liste tut um die list ^2 zu bekommen
            squaredNumbers.add(numberList.get(i) * numberList.get(i));
        }
        System.out.println("The unsorted List with all numbers factored by 2: " + squaredNumbers);
        System.out.println("The sorted List with all numbers factored by 2: " + squaredNumbers.stream().sorted().toList());
        return squaredNumbers;
    }
}