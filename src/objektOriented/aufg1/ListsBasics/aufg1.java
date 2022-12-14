package objektOriented.aufg1.ListsBasics;

import objektOriented.aufg1.aufg2.InputIn;

import java.util.ArrayList;
import java.util.List;

public class aufg1 {
    static List<Integer> numberList;

    public static void main(String[] args) {
        getNumbersForList();
    }

    public static void getNumbersForList() {
        List<Integer> inputIsPostionInList = new ArrayList<>();
        int x;
        x = addNumbers(inputIsPostionInList);

        numberList = inputIsPostionInList;

        checkNumbPosition(x, inputIsPostionInList);
    }

    private static int addNumbers(List<Integer> inputIsPostionInList) {
        int x, x1;
        System.out.println("Just type some numbers. To stop typing press Enter");

        String[] numbers = InputIn.nextLine().split("\\s+"); // \\s+ = more than one whitespace
        for (String number : numbers) {
            x1 = Integer.parseInt(number);
            inputIsPostionInList.add(x1);
        }
        x = inputIsPostionInList.get(0); //0 is index of first number to make it get that position
        return x;
    }

    private static void checkNumbPosition(int x, List<Integer> inputIsPostionInList) {
        if(x <= inputIsPostionInList.size() - 1) {
            System.out.println(
                    "This is the number at the position " + x + " that you entered = " + inputIsPostionInList.get(x));
        } else {
            System.out.println("ERROR! The position " + x + " doesn't exist");
        }
    }
}