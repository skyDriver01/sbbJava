package objektOriented.aufg1.aufg2;

import java.util.Scanner;

public final class InputIn { //Final zum nicht veränder bar.

    private InputIn() { //Damit es nicht Instanziert werden kann

    }

    private static Scanner scanner = new Scanner(System.in);

    public static String nextLine() {
        return scanner.nextLine();
    }

    public static String nextLineOut(String output) { //Hat Text bsp. "Schreibe deinen namen"
        System.out.println(output);
        return scanner.nextLine();
    }
    public static int nextIntOut(String output){
        System.out.println (output);
        return Integer.parseInt (scanner.nextLine ());
    }
    public static int nextInt(){
        return Integer.parseInt (scanner.nextLine ());
    }
}
