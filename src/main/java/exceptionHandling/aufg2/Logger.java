package exceptionHandling.aufg2;

import objektOriented.aufg1.aufg2.InputIn;

import java.io.*;

public class Logger {

    static String file = "C:\\Users\\E544157\\sbbJavaREAL\\src\\main\\java\\exceptionHandling\\aufg2\\application.log";
    public static void main(String[] args) {
        String choice = InputIn.nextLineOut("What would you like to do: Write or ReadLog");
        switch (choice) {
            case "ReadLog" -> readLog();
            case "Write" -> writeLog();
            default -> System.out.println("Not an Option.");
        }
    }

    public static void writeLog() {
        String input = InputIn.nextLineOut("Start Writing");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write(input);
            bw.close();
        } catch (IOException e) {
            System.out.println("Cant take an I/O" + e);
        }
    }

    public static void readLog() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            System.out.println(br.readLine());
        } catch (FileNotFoundException e) {
            System.out.println("That file does not seem to be here" + e);
        } catch (IOException e) {
            System.out.println("Cant take an I/O" + e);
        }
    }
}