package main.java.javaGrundlagen.labs1;

import java.util.Scanner;

public class aufg2 {
    public static void main(String[] args) {
        Scanner getTheName = new Scanner(System.in);
        System.out.println("What's your name?");
        String theName = getTheName.nextLine();
        Scanner getTheAge = new Scanner(System.in);
        System.out.println("How old are you?");
        int theAge = getTheAge.nextInt();
        System.out.println("Hello " + theName + " you are " + theAge + " years old");
    }
}
