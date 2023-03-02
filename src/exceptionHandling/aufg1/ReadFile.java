package exceptionHandling.aufg1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class ReadFile implements FileReadingInterface {

    static String file = "C:\\Users\\E544157\\sbbJavaREAL\\src\\exceptionHandling\\aufg1\\words.txt";
    @Override
    public void countWords() {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                count += words.length;
            }
            System.out.println("Total number of words: " + count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void allWordsWithAQ() {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.contains("q") || word.contains("Q")) {
                        count++;
                    }
                }
            }
            System.out.println("Total number of words containing 'q': " + count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void allSpecialCharactersOnce() {
        Set<Character> uniqueChars = new HashSet<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                char[] chars = line.toCharArray();
                for (char c : chars) {
                    if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                        uniqueChars.add(c);
                    }
                }
            }
            System.out.println("All unique special characters: " + uniqueChars);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void countWordsWithNumbers() {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if(word.matches("^[0-9]*$")){
                        count++;
                    }
                }
            }
            System.out.println("Total Number of Words with a Number in them: " + count);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

        @Override
    public void allWordsStartingWithB() {

    }
}
