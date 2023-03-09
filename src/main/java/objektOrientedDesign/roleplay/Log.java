package objektOrientedDesign.roleplay;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static main.java.objektOrientedDesign.roleplay.TextStuff.*;

public class Log {
    private static List <String> log = new ArrayList <>();
    public static void addMessage(String message) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        log.add(LocalDateTime.now().format(dtf) + " " + message);
        for (int i = 0; i < log.size(); i++) {
            System.out.println(ANSI_ICEBLUE + log.get(i).toString() + ANSI_RESET);
        }
    }
    public static void printFullLog() {
        for (String message : log) {
            System.out.println(ANSI_ICEBLUE + message + ANSI_RESET);
        }
    }
}