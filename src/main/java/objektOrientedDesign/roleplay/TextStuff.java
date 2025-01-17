package objektOrientedDesign.roleplay;
public class TextStuff {

    static public String ANSI_BLACK = "\u001B[30m";
    static public String ANSI_RED = "\u001B[31m";
    static public String ANSI_GREEN = "\u001B[32m";
    static public String ANSI_YELLOW = "\033[1;93m";
    static public String ANSI_BLUE = "\u001B[34m";
    static public String ANSI_PURPLE = "\u001B[35m";
    static public String ANSI_CYAN = "\u001B[36m";
    static public String ANSI_WHITE = "\u001B[37m";
    static public String ANSI_RESET = "\u001B[0m";
    static public String ANSI_ORANGE = "\u001b[38;5;172m";
    static public String ANSI_LIME = "\u001b[38;5;191m";
    static public String ANSI_BROWN = "\u001b[38;5;130m";
    static public String ANSI_GOLD = "\u001b[38;5;220m";
    static public String ANSI_MAGENTA = "\u001b[38;5;198m";
    static public String ANSI_ICEBLUE = "\u001b[38;5;195m";
    static public String ANSI_VIOLET = "\u001b[38;5;129m";
    public static String anyLine(String color){
        return color(color) + ":::::::::::::::::::::::::::::::::::::::::::::::::::::::" + color("");
    }

    @Deprecated
    public static String color(String color) {
        return switch (color) {
            case "black" -> ANSI_BLACK;
            case "red" -> ANSI_RED;
            case "green" -> ANSI_GREEN;
            case "yellow" -> ANSI_YELLOW;
            case "blue" -> ANSI_BLUE;
            case "purple" -> ANSI_PURPLE;
            case "cyan" -> ANSI_CYAN;
            case "white" -> ANSI_WHITE;
            case "orange" -> ANSI_ORANGE;
            case "lime" -> ANSI_LIME;
            case "brown" -> ANSI_BROWN;
            case "gold" -> ANSI_GOLD;
            case "magenta" -> ANSI_MAGENTA;
            case "ice" -> ANSI_ICEBLUE;
            case "violet" -> ANSI_VIOLET;
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
