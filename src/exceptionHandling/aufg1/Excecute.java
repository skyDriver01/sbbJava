package exceptionHandling.aufg1;

public class Excecute {
    public static void main(String[] args) {
        ReadFile readFile = new ReadFile();
        readFile.countWords();
        readFile.allWordsWithAQ();
        readFile.allSpecialCharactersOnce();
        readFile.allWordsStartingWithB();
        readFile.countWordsWithNumbers();
    }
}