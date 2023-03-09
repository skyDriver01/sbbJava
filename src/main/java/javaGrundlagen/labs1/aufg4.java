package main.java.javaGrundlagen.labs1;

import java.util.Scanner;

public class aufg4 {
    public static void main(String[] args) {
        summe(5, 18);
        namensParameter(null);
    }

    public static void summe(int a, int b) {
        System.out.println(a + b);
    }

    public static void namensParameter(String name) {
        Scanner getName = new Scanner(System.in);
        System.out.println("whats your name?");
        name = getName.nextLine();
        System.out.println("Hello " + name);
    }
}
