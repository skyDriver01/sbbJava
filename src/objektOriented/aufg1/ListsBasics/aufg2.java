package objektOriented.aufg1.ListsBasics;

import objektOriented.aufg1.aufg2.InputIn;

import java.util.ArrayList;
import java.util.List;

public class aufg2 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        String getWords;
        String input;
        /*do {
            input = getWords;
            words.add(input);
        } while (!(input.equals("exit")));*/
        getWords = InputIn.nextLineOut(
                "Type some words, some can be verbs or nouns they don't have to match to be a sentence," +
                " anything works.(Just be carefull bc when you type:" +
                " (exit) without the parantheses you will stop being able to type more words)");
        while (!(input = InputIn.nextLine()).equals("exit")) { //nicht unbedingt so machen bei richtigen code.
            getWords = (input);
            words.add(getWords);
        }
        System.out.println(words.size());
        checkForNouns(words);
    }

    private static void checkForNouns(List<String> words) {
        for (String noun : words) {
            if(noun.matches("^[A-Z]*" +
                            "[a-zA-Z]*$")) { //Die erste viereck klammer ist dafür da das es für den anfangsbuchstaben schaut das er gross ist und die zweite das der Rest hinten dran entweder klein oder gross ist.
                System.out.println(noun.toUpperCase());                                                     //Das ^ Ist für anfangsbuchstabe und $ für letzten buchstaben das * zum wiederholen
            }
        }
    }
}