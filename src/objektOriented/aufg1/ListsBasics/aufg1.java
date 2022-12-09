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
        System.out.println(numberList);
        int x;

        x = addOrExit(inputIsPostionInList);

        numberList = inputIsPostionInList;

        checkNumbPosition(x, inputIsPostionInList);
    }

    private static int addOrExit(List<Integer> inputIsPostionInList) { //addOrExit means add more numbers or type exit to start checking the list
        int x, x1;
        String input;
        x = Integer.parseInt(InputIn.nextLineOut("Type a sequence of random Numbers if you want to stop adding numbers type: exit"));
        while (!(input = InputIn.nextLine()).equals("exit")) { //nicht unbedingt so machen bei richtigen code.
            x1 = Integer.parseInt(input);
            inputIsPostionInList.add(x1);
        }
        return x;
    }

    private static void checkNumbPosition(int x, List<Integer> inputIsPostionInList) {
        if (x <= inputIsPostionInList.size() - 1){
            System.out.println(
                    "This is the number at the position " + x + " that you entered = " + inputIsPostionInList.get(x));
        } else {
            System.out.println("ERROR! The position " + x + " doesn't exist");
        }
    }
}