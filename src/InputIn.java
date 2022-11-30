import java.util.Scanner;

public final class InputIn {

    private InputIn() {
    }

    private static Scanner scanner = new Scanner(System.in);

    public static String nextLine(String output) {
        System.out.println(output);
        return scanner.nextLine();
    }
}
