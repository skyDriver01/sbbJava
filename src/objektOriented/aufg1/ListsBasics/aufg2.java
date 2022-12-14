package objektOriented.aufg1.ListsBasics;

import objektOriented.aufg1.aufg2.InputIn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class aufg2 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        addWords(words);
        System.out.println(words);
        reverseTheOrder(words);
    }

    private static void addWords(List<String> words) {
        String input;
        String getWords;
        System.out.println("Type some words, some can be verbs or nouns they don't have to match to be a sentence," +
                           " anything works.(Just be carefull bc when you type:" +
                           " (exit) without the parantheses you will stop being able to type more words)");
        while (!(input = InputIn.nextLine()).equals("exit")) { //nicht unbedingt so machen bei richtigen code. Do-while wäre besser.
            getWords = (input);
            words.add(getWords);
        }
        System.out.println(words.size());
        checkForNouns(words);
    }

    private static void checkForNouns(List<String> words) {
        for (String noun : words) {
            if(noun.matches(".*[A-Z].*"))//Doesn't work yet
                System.out.println(noun.toUpperCase());
        }
    }

    private static void reverseTheOrder(List<String> words) {
        Collections.reverse(words);
        System.out.println(words);
    }
}