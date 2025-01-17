package exceptionHandling.aufg3;

import objektOriented.aufg1.aufg2.InputIn;

public class RandomMath {
    public static void main(String[] args) {
        getNumbers();
    }

    public static void getNumbers() {
        try {
            int input1 = InputIn.nextIntOut("Give me a Number");
            int input2 = InputIn.nextIntOut("Give me another Number");
            calculate(input1, input2);
        }
        catch (NumberFormatException e){
            System.out.println("That is not a Number" + e);
            getNumbers();
        }
    }

    public static void calculate(int a, int b) {
        if(Math.random() * 1 < 0 + 0.25) {
            System.out.println(a + b);
        } else {
            if(Math.random() * 1 < 0 + 0.25) {
                System.out.println(a - b);
            } else {
                if(Math.random() * 1 < 0 + 0.25) {
                    System.out.println(a * b);
                } else {
                    if(Math.random() * 1 < 0 + 0.25) {
                        System.out.println(a / b);
                    } else {
                        System.out.println("Guess chance did not want to calculate atm");
                    }
                }
            }
        }
    }
}