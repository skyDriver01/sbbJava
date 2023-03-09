package main.java.objektOriented.aufg1.aufg2;

import java.util.Scanner;

public final class InputIn { //Final zum nicht veränder bar.

    private InputIn() { //Damit es nicht Instanziert werden kann

    }

    private static Scanner scanner = new Scanner(System.in);

    public static String nextLine() {
        return scanner.nextLine();
    }

    public static String next() {
        return scanner.next();
    }

    public static String nextOut(String output) {
        System.out.println(output);
        return scanner.next();
    }

    public static String nextLineOut(String output) { //Hat Text bsp. "Schreibe deinen namen"
        System.out.println(output);
        return scanner.nextLine();
    }

    public static int nextLineIntOut(String output) {
        System.out.println(output);
        return Integer.parseInt(scanner.nextLine());
    }

    public static int nexIntOut(String output) {
        System.out.println(output);
        return Integer.parseInt(scanner.next());
    }

    public static int nexInt() {
        return Integer.parseInt(scanner.next());
    }

    public static int nextLineInt() {
        return Integer.parseInt(scanner.nextLine());
    }
    public static String[] nextLineArrayOut(String output) { //Hat Text bsp. "Schreibe deinen namen"
        System.out.println(output);
        return new String[]{scanner.nextLine()};
    }
}
