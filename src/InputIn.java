import java.util.Scanner;

public final class InputIn {

    private InputIn() {

    }

    private static Scanner scanner = new Scanner(System.in);

    public static String nextLine() {
        return scanner.nextLine();
    }

    public static String nextLineOut(String output) { //Hat Text bsp. "Schreibe deinen namen"
        System.out.println(output);
        return scanner.nextLine();
    }
    /*public static void main(String[] args) {
        String name = InputIn.nextLineOut("Wie heisst du?");
        System.out.println(name);
    }
*/
}
