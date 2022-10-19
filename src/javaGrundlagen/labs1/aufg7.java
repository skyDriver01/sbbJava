package javaGrundlagen.labs1;

import java.util.Scanner;

public class aufg7 {
    public static void main(String[] args) {
        Scanner getAWordToMirror = new Scanner(System.in);
        System.out.println("Type a Word");
        // umgekehrtString(getAWordToMirror.nextLine());
        System.out.println("");
        Scanner getTheNumberOfWords = new Scanner(System.in);
        System.out.println("Type a Sentence ");
        countNumberOfWords(String.valueOf(getTheNumberOfWords.nextLine()));
    }

 /*   public static void umgekehrtString(String dasWortZumUmkehren) {
        for (int i = dasWortZumUmkehren.length() - 1; i >= 0; i--) {
            System.out.print(dasWortZumUmkehren.charAt(i));
        }
    }*/

    public static void countNumberOfWords(String countTheWordsInThisSentence) {
        int countTheSpaces = 0;
        int correctTheSpaces;
        for (correctTheSpaces = 0; countTheWordsInThisSentence.contains("  "); ) {
            countTheWordsInThisSentence = countTheWordsInThisSentence.replaceFirst("  ", " ");
        }
        if (countTheWordsInThisSentence.contains(" ")) {
            countTheSpaces++;
        }
        countTheSpaces += 1;
        System.out.println(countTheSpaces);
    }
}