package generics_two.set.aufg1;

import java.util.List;
import java.util.Set;

public class Vereine {
    Set <String> fussballVerein = Set.of("Emil", "Hans", "Felix", "Fritz", "Patrick", "Hanne", "Anja", "Paula", "Petra", "Anna");

    Set <String> schwimmVerein = Set.of("Emil", "Klaus", "Paul", "Fritz", "Patrick", "Hanne", "Anina", "Nicole", "Petra", "Gerda");

    Set <String> musikVerein = Set.of("Kari", "Hans", "Max", "Karin", "Petra", "Anna");

    Set <String> tanzVerein = Set.of("Emil", "Hans", "Paul", "Felix", "Max", "Lara", "Anja", "Sabine", "Anna");

    List <Set<String>> vereine = List.of(fussballVerein, schwimmVerein, musikVerein, tanzVerein);
    public static void main(String[] args) {

    }
    public static void anzahlMinPersonenDerVereine(){

    }
    public static void personenBeimFussballUndTanzVerein(){

    }
    public static void personenBeimFussballVerein(){

    }
}