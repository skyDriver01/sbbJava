package generics_two.set.aufg1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Vereine {
    static Set <String> fussballVerein = Set.of("Emil", "Hans", "Felix", "Fritz", "Patrick", "Hanne", "Anja", "Paula", "Petra", "Anna");

    static Set <String> schwimmVerein = Set.of("Emil", "Klaus", "Paul", "Fritz", "Patrick", "Hanne", "Anina", "Nicole", "Petra", "Gerda");

    static Set <String> musikVerein = Set.of("Kari", "Hans", "Max", "Karin", "Petra", "Anna");

    static Set <String> tanzVerein = Set.of("Emil", "Hans", "Paul", "Felix", "Max", "Lara", "Anja", "Sabine", "Anna");

    static Set <String> alleVereine = new HashSet <>();

    static List <Set <String>> vereine = List.of(fussballVerein, schwimmVerein, musikVerein, tanzVerein);
    private static OutputValidation outputValidation = new OutputValidation();

    public static void main(String[] args) {
        alleVereine.addAll(fussballVerein.stream().sorted().toList());
        alleVereine.addAll(tanzVerein.stream().sorted().toList());
        alleVereine.addAll(schwimmVerein.stream().sorted().toList());
        alleVereine.addAll(musikVerein.stream().sorted().toList());
        anzahlMinPersonenDerVereine();
        personenBeimFussballUndTanzVerein();
        personenBeimFussballVerein();
        outputValidation.printControlHash();
        System.out.println(outputValidation.verifyControlHash(-1421274666));
    }

    public static void anzahlMinPersonenDerVereine() {
        outputValidation.logAndPrint("- Wie viele Personen machen min. in einem Verein mit: " +
                                     alleVereine.size() +
                                     ": " +
                                     alleVereine
                                             .stream()
                                             .sorted()
                                             .toList()
                                             .toString()
                                             .replace(" ", "")
                                             .replace("[", "")
                                             .replace("]", ""));
    }

    public static void personenBeimFussballUndTanzVerein() {
        List <String> beideVereine = new ArrayList <>();
        for (String person : fussballVerein) {
            if(tanzVerein.contains(person)) {
                beideVereine.add(person);
            }
        }
        outputValidation.logAndPrint("- Alle Personen, welche im Fussball und Tanz Verein sind: " +
                                     beideVereine.size() +
                                     ": " +
                                     beideVereine
                                             .stream()
                                             .sorted()
                                             .toList()
                                             .toString()
                                             .replace(" ", "")
                                             .replace("[", "")
                                             .replace("]", ""));
    }

    public static void personenBeimFussballVerein() {
        List <String> fussballer = new ArrayList <>();
        for (String person : fussballVerein) {
            if(!tanzVerein.contains(person) && !schwimmVerein.contains(person)) {
                fussballer.add(person);
            }
        }
        outputValidation.logAndPrint("- Alle Personen, welche im Fussball sind und nicht im Tanz oder Schwimm Verein: " +
                                     fussballer.size() +
                                     ": " +
                                     fussballer
                                             .stream()
                                             .sorted()
                                             .toList()
                                             .toString()
                                             .replace(" ", "")
                                             .replace("[", "")
                                             .replace("]", ""));
    }
}