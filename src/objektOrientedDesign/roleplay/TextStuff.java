package objektOrientedDesign.roleplay;

public class TextStuff {

    public static String whiteLine() {
        return color("white") + ":::::::::::::::::::::::::::::::::::::::::::::::::::::::" + color("r");
    }
    public static String greenLine() {
        return color("green") + ":::::::::::::::::::::::::::::::::::::::::::::::::::::::" + color("r");
    }
    public static String redLine() {
        return color("red") + ":::::::::::::::::::::::::::::::::::::::::::::::::::::::" + color("r");
    }
    public static String blueLine() {
        return color("blue") + ":::::::::::::::::::::::::::::::::::::::::::::::::::::::" + color("r");
    }
    public static String yellowLine() {
        return color("yellow") + ":::::::::::::::::::::::::::::::::::::::::::::::::::::::" + color("r");
    }
    public static String purpleLine() {
        return color("purple") + ":::::::::::::::::::::::::::::::::::::::::::::::::::::::" + color("r");
    }

    public static String color(String color) {
        final String ANSI_BLACK = "\u001B[30m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\033[1;93m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_WHITE = "\u001B[37m";
        final String ANSI_RESET = "\u001B[0m";

        return switch (color) {
            case "black" -> ANSI_BLACK;
            case "red" -> ANSI_RED;
            case "green" -> ANSI_GREEN;
            case "yellow" -> ANSI_YELLOW;
            case "blue" -> ANSI_BLUE;
            case "purple" -> ANSI_PURPLE;
            case "cyan" -> ANSI_CYAN;
            case "white" -> ANSI_WHITE;
            default -> ANSI_RESET;
        };
    }
}
