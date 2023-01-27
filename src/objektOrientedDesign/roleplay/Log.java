package objektOrientedDesign.roleplay;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static objektOrientedDesign.roleplay.TextStuff.*;

public class Log {
    private static List <String> log = new ArrayList <>();
    public static void addMessage(String message) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        log.add(LocalDateTime.now().format(dtf) + " " + message);
    }
    public static void printLog() {     //Todo: namen ändern und auch noch log ändern das es die System.out.println nicht braucht wie bei case 6 vom fight: Das einfach der Log es printed
        for (String message : log) {
            System.out.println(ANSI_ICEBLUE + message + ANSI_RESET);
        }
    }
}