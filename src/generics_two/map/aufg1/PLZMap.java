package generics_two.map.aufg1;

import generics_two.set.aufg1.OutputValidation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
                data.put(values[1], values[0]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        outputValidation.logAndPrint("- Anzahl PLZ: " + data.size());
        smallestPLZ("Bern");
        largestPLZ("Bern");
        gemeindenWithNLetters(10);
        gemeindenWithNLetters(7);
        gemeindenWithSubstr("ent");
        gemeindenWithNLetters(3);
        smallestGemeinden();
        largestGemeinden();
        outputValidation.printControlHash();
        System.out.println(outputValidation.verifyControlHash(1768988137));
    }

    public static void smallestPLZ(String gemeinde) {
        String smallestPLZ = data
                .entrySet()
                .stream()
                .filter(entry -> entry.getKey().equals(gemeinde))
                .map(Map.Entry::getValue)
                .min(Comparator.naturalOrder())
                .orElse(null);
        if(smallestPLZ != null) {
            outputValidation.logAndPrint(
                    "- Kleinste PLZ der Gemeinde " + gemeinde + ": " + smallestPLZ + " " + gemeinde);
        }
    }

    public static void largestPLZ(String gemeinde) {
        String largestPLZ = data
                .entrySet()
                .stream()
                .filter(entry -> entry.getKey().equals(gemeinde))
                .map(Map.Entry::getValue)
                .max(Comparator.naturalOrder())
                .orElse(null);
        if(largestPLZ != null) {
            outputValidation.logAndPrint("- Grösste PLZ der Gemeinde " + gemeinde + ": " + largestPLZ + " " + gemeinde);
        } else {
            outputValidation.logAndPrint("- No PLZ found for Gemeinde " + gemeinde);
        }
    }

    public static void gemeindenWithNLetters(int n) {
        if(n == 10) {
            long count = data.entrySet().stream().filter(entry -> entry.getKey().length() > 10).count();
            outputValidation.logAndPrint("- Anzahl Gemeinden mit mehr als 10 Buchstaben: " + count);
        } else {
            if(n == 7) {
                List <String> gemeinden = data
                        .entrySet()
                        .stream()
                        .filter(entry -> entry.getKey().length() > 0 && entry.getKey().length() < 6)
                        .map(entry -> entry.getValue())
                        .distinct()
                        .filter(gemeinde -> gemeinde.length() == n)
                        .collect(Collectors.toList());
                outputValidation.logAndPrint("- Anzahl Gemeinden mit 7 Buchstaben: " + gemeinden);
            } else {
                long count = data
                        .entrySet()
                        .stream()
                        .filter(entry -> entry.getKey().length() > 0 && entry.getKey().length() < 6)
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
                .sorted(Comparator.comparingInt(String::length))
                .limit(3)
                .collect(Collectors.toList());
        outputValidation.logAndPrint("- Anzahl Buchstaben der kleinsten Gemeinden:");
        outputValidation.logAndPrint(
                "- Kleinsten Gemeinden: " + smallestGemeinden.stream().collect(Collectors.joining(", ")));
    }

    public static void largestGemeinden() {
        List <String> largestGemeinden = data
                .keySet()
                .stream()
                .sorted(Comparator
                                .comparingInt(String::length)
                                .reversed())
                .limit(3)
                .collect(Collectors.toList());
        outputValidation.logAndPrint("- Anzahl Buchstaben der größten Gemeinden: " + largestGemeinden
                .stream()
                .map(String::length)
                .map(Object::toString)
                .collect(Collectors.joining(", ")));
        outputValidation.logAndPrint(
                "- Grössten Gemeinden: " + largestGemeinden.stream().collect(Collectors.joining(", ")));
    }
}