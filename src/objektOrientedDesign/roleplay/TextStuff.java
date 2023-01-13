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
        final String ANSI_ORANGE = "";
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

    public static String backColor(String color) {
        final String ANSI_BLACK = "\u001B[40m";
        final String ANSI_RED = "\u001B[41m";
        final String ANSI_GREEN = "\u001B[42m";
        final String ANSI_YELLOW = "\033[43m";
        final String ANSI_BLUE = "\u001B[44m";
        final String ANSI_PURPLE = "\u001B[45m";
        final String ANSI_CYAN = "\u001B[46m";
        final String ANSI_WHITE = "\u001B[47m";
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

    public static String textType(String type) {
        final String ANSI_BOLD = "\u001b[1m";
        final String ANSI_UNDERLINED = "\u001b[4m";
        final String ANSI_REVERSED = "\u001b[7m";
        final String ANSI_RESET = "\u001b[0m";
        return switch (type) {
            case "bold" -> ANSI_BOLD;
            case "underline" -> ANSI_UNDERLINED;
            case "reversed" -> ANSI_REVERSED;
            default -> ANSI_RESET;
        };
    }
}
