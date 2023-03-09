package main.java.objektOriented.aufg1.streamBasics;

import main.java.objektOriented.aufg1.aufg2.InputIn;

import java.util.Arrays;
import java.util.List;

public class aufg2 {
    public static void main(String[] args) {
        List <Integer> numberList = addNumbers();
        originalList(numberList);
        List <Integer> multiplied = multipliedList(numberList);

        System.out.println("The unsorted List with all numbers factored by 2: " + multiplied);
        System.out.println("The sorted List with all numbers factored by 2: " + multiplied.stream()
                .sorted()
                .toList());
    }

    private static void originalList(List <Integer> numberList) {
        System.out.println("The unsorted List without all numbers multiplied with themselves: " + numberList);
        System.out.println("The sorted List without all numbers multiplied with themselves: " + numberList.stream()
                .sorted()
                .toList());
    }

    private static List <Integer> addNumbers() {
        System.out.println("Type some numbers as you want");
        String[] numbers = InputIn.nextLine()
                .split("\\s+");

        return Arrays.stream(numbers)
                .mapToInt(Integer::parseInt)
                .boxed()
                .toList();

    }

    private static List <Integer> multipliedList(List <Integer> numberList) {
        return numberList.stream()
                .map(n -> n * n)  // Map ist dafür da um von einer variabel den Datentyp zu ändern zu diese mwo man will.
                .toList();

    }
}