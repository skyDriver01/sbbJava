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
        String csvFile = "C:\\Users\\E544157\\sbbJavaREAL\\src\\generics_two\\map\\Postleitzahlen_UTF8.csv";
        String line = "";
        String cvsSplitBy = ",";
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] values = line.split(cvsSplitBy);
                try {
                    Integer.parseInt(values[0]);
                    data.put(values[0], values[1].replace("\"", ""));
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
        gemeindenWith3Letters();
        gemeindenWithSubstr("ent");
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
        outputValidation.logAndPrint(
                "- Grösste PLZ der Gemeinde " + gemeinde + ": " + makeLargestPLZ + " " + gemeinde);
    }


    public static void gemeindenWithNLetters(int n) {
        if(n == 10) {
            long count = data.entrySet().stream().filter(entry -> entry.getValue().length() > 10).count();
            outputValidation.logAndPrint("- Anzahl Gemeinden mit mehr als 10 Buchstaben: " + count);
        } else {
            if(n == 7) {
                long count = data
                        .entrySet()
                        .stream()
                        .filter(entry -> entry.getKey().length() > 0 && entry.getValue().length() == n &&
                                         !entry.getKey().equals(""))
                        .map(entry -> entry.getValue())
                        .distinct()
                        .count();
                outputValidation.logAndPrint("- Anzahl Gemeinden mit 7 Buchstaben: " + count);
            } else {
                long count = data
                        .entrySet()
                        .stream()
                        .filter(entry -> entry.getKey().length() > 0 && entry.getValue().length() < 6)
                        .map(entry -> entry.getKey())
                        .filter(key -> key.length() == n)
                        .count();
                outputValidation.logAndPrint("- Anzahl Gemeinden mit " + n + " Buchstaben: " + count);
            }
        }
    }

    public static void gemeindenWithSubstr(String substr) {
        long count = data.keySet().stream().filter(key -> key.contains(substr)).count();
        outputValidation.logAndPrint("- Anzahl Gemeinden mit der Buchstabenfolge '" + substr + "': " + count);
    }

    public static void smallestGemeinden() {
        List <String> smallestGemeinden = data
                .keySet()
                .stream()
                .filter(g -> !g.isEmpty())
                .filter(g -> g
                                     .trim()
                                     .length() > 0)
                .sorted(Comparator.comparingInt(String::length))
                .limit(1)
                .collect(Collectors.toList());
        outputValidation.logAndPrint("- Anzahl Buchstaben der kleinsten Gemeinden: " + smallestGemeinden
                .stream()
                .map(String::length)
                .map(Object::toString)
                .collect(Collectors.joining(", ")));
        outputValidation.logAndPrint(
                "- Kleinsten Gemeinden: " + smallestGemeinden.stream().collect(Collectors.joining(", ")));
    }

    public static void largestGemeinden() {
        List <String> largestGemeinden = data
                .keySet()
                .stream()
                .filter(g -> !g.isEmpty())
                .filter(g -> g
                                     .trim()
                                     .length() > 0)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .limit(1)
                .collect(Collectors.toList());
        outputValidation.logAndPrint("- Anzahl Buchstaben der größten Gemeinden: " + largestGemeinden
                .stream()
                .map(String::length)
                .map(Object::toString)
                .collect(Collectors.joining(", ")));
        outputValidation.logAndPrint(
                "- Grössten Gemeinden: " + largestGemeinden.stream().collect(Collectors.joining(", ")));
    }

    public static void gemeindenWith3Letters() {
        List <String> gemeindenWith3Letters = data
                .keySet()
                .stream()
                .filter(g -> g.trim().length() == 3)
                .collect(Collectors.toList());
        outputValidation.logAndPrint(
                "- Gemeinden mit 3 Buchstaben: " + gemeindenWith3Letters.stream().collect(Collectors.joining(", ")));
    }
}