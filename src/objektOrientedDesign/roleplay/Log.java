package objektOrientedDesign.roleplay;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static objektOrientedDesign.roleplay.TextStuff.color;

public class Log {
    private static List <String> log = new ArrayList <>();
    public static void addMessage(String message) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        log.add(LocalDateTime.now().format(dtf) + " " + message);
    }
    public static void printLog() {
        for (String message : log) {
            System.out.println(color("ice") + message + color(""));
        }
    }
}