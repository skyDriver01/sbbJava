package generics_two.map.aufg1;

import generics_two.set.aufg1.OutputValidation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class PLZMap {
    static HashMap <String, String> data = new HashMap <>();
    static OutputValidation outputValidation = new OutputValidation();

    public static void main(String[] args) {
        String csvFile = "src/main/java/generics_two/map/Postleitzahlen_UTF8.csv";
        String line = "";
        String cvsSplitBy = ",\"";
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] values = line.split(cvsSplitBy);
                try {
                    Integer.parseInt(values[0]);
                    data.put(values[0].trim(), values[1].replace("\"", "").trim());
                } catch (NumberFormatException ignore) {

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        outputValidation.logAndPrint("- Anzahl PLZ: " + data.size());
        smallestPLZ("Bern");
        largestPLZ("Bern");
        gemeindenWithNLetters(10);
        gemeindenWithNLetters(7);
        gemeindenWithSubstr();
        gemeindenWith3Letters();
        smallestGemeinden();
        largestGemeinden();
        outputValidation.printControlHash();
        System.out.println(outputValidation.verifyControlHash(1768988137));
    }

    public static void smallestPLZ(String gemeinde) {
        int makeSmallestPlz = 9999;
        for (String plz : data.keySet()) {
            if(Integer.parseInt(plz) < makeSmallestPlz && data.get(plz).equals(gemeinde)) {
                makeSmallestPlz = Integer.parseInt(plz);
            }
        }
        outputValidation.logAndPrint(
                "- Kleinste PLZ der Gemeinde " + gemeinde + ": " + makeSmallestPlz + " " + gemeinde);
    }

    public static void largestPLZ(String gemeinde) {
        int makeLargestPLZ = 0;
        for (String plz : data.keySet()) {
            if(Integer.parseInt(plz) > makeLargestPLZ && data.get(plz).equals(gemeinde)) {
                makeLargestPLZ = Integer.parseInt(plz);
            }
        }
        outputValidation.logAndPrint("- Grösste PLZ der Gemeinde " + gemeinde + ": " + makeLargestPLZ + " " + gemeinde);
    }

    public static void gemeindenWithNLetters(int n) {
        long count = 0;
        if(n == 10) {
            count = data.entrySet().stream().filter(entry -> entry.getValue().length() > 10).count();
            outputValidation.logAndPrint("- Anzahl Gemeinden mit mehr als 10 Buchstaben: " + count);
        } else {
            count = data
                    .entrySet()
                    .stream()
                    .filter(entry -> entry.getValue().length() == n)
                    .map(entry -> entry.getValue() + "_" + entry.getKey())
                    .distinct()
                    .count();
            outputValidation.logAndPrint("- Anzahl Gemeinden mit " + n + " Buchstaben: " + count);
        }
    }


    public static void gemeindenWithSubstr() {
        long count = data.entrySet().stream().filter(entry -> entry.getValue().contains("ent") ||
                                                              entry.getValue().contains(("Ent"))).count();
        outputValidation.logAndPrint("- Anzahl Gemeinden mit der Buchstabenfolge 'ent': " + count);
    }

    public static void smallestGemeinden() {
        List <String> smallestGemeinden = data
                .values()
                .stream()
                .filter(g -> !g.isEmpty())
                .filter(g -> g
                                     .trim()
                                     .length() > 0)
                .sorted(Comparator.comparingInt(s1 -> s1.length()))
                .limit(1)
                .collect(Collectors.toList());
        outputValidation.logAndPrint("- Anzahl Buchstaben der kleinsten Gemeinden: " + smallestGemeinden
                .stream()
                .map(s -> s.length())
                .map(integer -> integer.toString())
                .collect(Collectors.joining(", ")));
        outputValidation.logAndPrint("- Kleinsten Gemeinden: " + data.entrySet().stream().filter(e -> e
                .getValue()
                .equals(smallestGemeinden.get(0))).map(entry -> entry.getValue()).collect(Collectors.joining(", ")));
    }

    public static void largestGemeinden() {
        List <String> largestGemeinden = data
                .values()
                .stream()
                .filter(g -> !g.isEmpty())
                .filter(g -> g
                                     .trim()
                                     .length() > 0)
                .sorted(Comparator.comparingInt((String s1) -> s1.length()).reversed())
                .limit(1)
                .collect(Collectors.toList());
        outputValidation.logAndPrint("- Anzahl Buchstaben der grössten Gemeinden: " + largestGemeinden
                .stream()
                .map(s -> s.length())
                .map(integer -> integer.toString())
                .collect(Collectors.joining(", ")));
        outputValidation.logAndPrint("- Grössten Gemeinden: " + data.entrySet().stream().filter(e -> e
                .getValue()
                .equals(largestGemeinden.get(0))).map(entry -> entry.getValue()).collect(Collectors.joining(", ")));
    }

    public static void gemeindenWith3Letters() {
        List <String> gemeindenWith3Letters = data.values().stream().filter(g -> g.length() == 3).sorted().toList();
        outputValidation.logAndPrint(
                "- Gemeinden mit 3 Buchstaben: " + gemeindenWith3Letters.stream().collect(Collectors.joining(", ")));
    }
}