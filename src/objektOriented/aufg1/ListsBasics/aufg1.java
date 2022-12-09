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
        int x, x1, x2, x3, x4, x5, x6, x7, x8, x9;
        x = InputIn.nextIntOut("Type a sequence of random Numbers");
        x1 = InputIn.nextInt();
        x2 = InputIn.nextInt();
        x3 = InputIn.nextInt();
        x4 = InputIn.nextInt();
        x5 = InputIn.nextInt();
        x6 = InputIn.nextInt();            //TODO make it so you can choose how many numbers you want in the List
        x7 = InputIn.nextInt();
        x8 = InputIn.nextInt();
        x9 = InputIn.nextIntOut("Enter the last number");

        addToList(x, x1, x2, x3, x4, x5, x6, x7, x8, x9);
    }

    private static void addToList(int x, int x1, int x2, int x3, int x4, int x5, int x6, int x7, int x8, int x9) {
        List<Integer> inputIsPostionInList = new ArrayList<>(); //variabel heisst wenn 3 eingegeben als input das die 3te stelle in der Liste angeschaut wird.
        inputIsPostionInList.add(x);
        inputIsPostionInList.add(x1);
        inputIsPostionInList.add(x2);
        inputIsPostionInList.add(x3);
        inputIsPostionInList.add(x4);
        inputIsPostionInList.add(x5);
        inputIsPostionInList.add(x6);
        inputIsPostionInList.add(x7);
        inputIsPostionInList.add(x8);
        inputIsPostionInList.add(x9);
        numberList = inputIsPostionInList;
        checkNumbPosition(x, inputIsPostionInList);
    }

    private static void checkNumbPosition(int x, List<Integer> inputIsPostionInList) {
        if (x <= inputIsPostionInList.size() - 1){
            System.out.println("This is the number at the position " + x + " that you entered first= " +
                    inputIsPostionInList.get(x));
        } else {
            System.out.println("ERROR! The position " + x + " doesn't exist");
        }
    }
}
