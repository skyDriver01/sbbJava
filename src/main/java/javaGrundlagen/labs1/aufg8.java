package main.java.javaGrundlagen.labs1;

import java.util.Scanner;

public class aufg8 {
    public static void main(String[] args) {
        Scanner getNumberToFindInArray = new Scanner(System.in);
        System.out.println("Say a number between 10 and 20");
        int x = Integer.parseInt(getNumberToFindInArray.nextLine());
        System.out.println(getTheSearchedNumberFromTheArray(new int[]{12, 14, 15, 13, 10, 19, 11, 20, 17, 16, 18}, x));
        System.out.println(" ");
        System.out.println(getTheBiggestNumberInThisArray(new int[]{99, 108, 1, 2, 76, 534, 998, 123, 223, 999, 1000, 1567, 23423, 345, 98989898}));
    }

    public static int getTheSearchedNumberFromTheArray(int[] theArrayToSearch, int theSearchedNumber) {
        for (int i = 0; i < theArrayToSearch.length; i++) {
            if (theSearchedNumber == theArrayToSearch[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int getTheBiggestNumberInThisArray(int[] theArrayWithTheBigNumbersToSearch) {
        int biggestNumber = theArrayWithTheBigNumbersToSearch[0];
        for (int number : theArrayWithTheBigNumbersToSearch) {
            if (number > biggestNumber) {
                biggestNumber = number;
            }
        }
        return biggestNumber;
       /* for (int i = 0; i < theArrayWithTheBigNumbersToSearch.length; i++) {
            i++;
            /*for (int j = 1; j < theArrayWithTheBigNumbersToSearch.length; j++) {
                if (theArrayWithTheBigNumbersToSearch[i] < theArrayWithTheBigNumbersToSearch[j]) {
                    theArrayWithTheBigNumbersToSearch[i] = theArrayWithTheBigNumbersToSearch[j];
                }

            }*/
    }
}