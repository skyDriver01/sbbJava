package objektOriented.aufg1.ListsBasics;

import objektOriented.aufg1.aufg2.InputIn;

import java.util.ArrayList;
import java.util.List;

public class aufg1 {
    static List<Integer> numberList;

    public static void main(String[] args) {
        getNumbersForList();
        System.out.println(numberList);
    }

    public static void getNumbersForList() {
        List<Integer> inputIsPostionInList = new ArrayList<>();
        String input;
        int x, x1;
        x = Integer.parseInt(InputIn.nextLineOut("Type a sequence of random Numbers if you want to stop adding numbers type: exit"));         //x is the number to search for in the list x1-x9 are the numbers that will be put in the list but after you can choose the amount it would be x1-xUnlimited
        while (!(input = InputIn.nextLine()).equals("exit")) { //nicht unbedingt so machen bei richtigen code.
            x1 = Integer.parseInt(input);
            inputIsPostionInList.add(x1);
        }
        //TODO make it so you can type as many numbers as you want until you stay stop
        inputIsPostionInList.add(x);                //variabel heisst wenn 3 eingegeben als input das die 3te stelle in der Liste angeschaut wird.

        numberList = inputIsPostionInList;

        checkNumbPosition(x, inputIsPostionInList);

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