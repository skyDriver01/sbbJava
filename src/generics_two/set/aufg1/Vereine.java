package generics_two.set.aufg1;

import java.util.List;
import java.util.Set;

public class Vereine {
    static Set <String> fussballVerein = Set.of("Emil", "Hans", "Felix", "Fritz", "Patrick", "Hanne", "Anja", "Paula", "Petra", "Anna");

    static Set <String> schwimmVerein = Set.of("Emil", "Klaus", "Paul", "Fritz", "Patrick", "Hanne", "Anina", "Nicole", "Petra", "Gerda");

    static Set <String> musikVerein = Set.of("Kari", "Hans", "Max", "Karin", "Petra", "Anna");

    static Set <String> tanzVerein = Set.of("Emil", "Hans", "Paul", "Felix", "Max", "Lara", "Anja", "Sabine", "Anna");

    static List <Set <String>> vereine = List.of(fussballVerein, schwimmVerein, musikVerein, tanzVerein);
    private static OutputValidation outputValidation = new OutputValidation();

    public static void main(String[] args) {
        outputValidation.logAndPrint("Start working");
        anzahlMinPersonenDerVereine();
        personenBeimFussballUndTanzVerein();
        personenBeimFussballVerein();
        outputValidation.logAndPrint("I'm finish.");
        System.out.println(outputValidation.verifyControlHash(-1421274666));
    }

    public static void anzahlMinPersonenDerVereine() {
        for (Set <String> name : vereine) {
            System.out.println(name.size());
        }
    }

    public static void personenBeimFussballUndTanzVerein() {
        for (Set <String> person : vereine) {
            if(person.contains(fussballVerein) && person.contains(tanzVerein)) {
                System.out.println(person);
            }
        }
    }

    public static void personenBeimFussballVerein() {
        for (Set <String> person : vereine) {
            if(person.contains(fussballVerein)) {
                person.size();
            }
        }
    }
}