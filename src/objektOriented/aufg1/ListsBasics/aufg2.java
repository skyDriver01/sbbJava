package objektOriented.aufg1.ListsBasics;

import objektOriented.aufg1.aufg2.InputIn;

import java.util.ArrayList;
import java.util.List;

public class aufg2 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        String input = InputIn.nextLineOut("Type some words, some can be verbs or nouns they don't have to match to be a sentence anything works.");
        words.add(input);
        System.out.println(words.size());
        System.out.println(words.contains("A-Z"));
    }
}