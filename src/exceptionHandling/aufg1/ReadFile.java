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
                    if(word.contains("q") || word.contains("Q")) {
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
        Set <Character> uniqueChars = new HashSet <>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                char[] chars = line.toCharArray();
                for (char c : chars) {
                    if(!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
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
                    if(word.contains("0") || word.contains("1") || word.contains("2") || word.contains("3") ||
                       word.contains("4") || word.contains("5") || word.contains("6") || word.contains("7") ||
                       word.contains("8") || word.contains("9")) {
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
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");            //Doesnt really check yet if its only the starting letter just for Capital B atm
                for (String word : words) {
                    if(word.matches(".*[B].*")) {
                        System.out.println(word);
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
