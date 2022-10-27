package javaGrundlagen.labs1;

import java.util.Scanner;

public class aufg6 {
    public static void main(String[] args) {
        fakultaet(4);
        einsBisHundert(0);
    }
    public static void fakultaet(int a){
        int fakult = 5;
        for (int n = 1; n+5 <= a; n++){
            fakult = fakult * n;
            System.out.println(fakult);
        }
    }
    public static void einsBisHundert(int a){
        Scanner getA = new Scanner(System.in);
        System.out.println("Type a Number");
        a = Integer.parseInt(getA.nextLine());
        int sum = 0;
        int start = 0;
        while (start <= 100){
            start++;
            if (start % a == 0){
                sum = start + sum;
                System.out.println(sum);
            }
        }
    }
}