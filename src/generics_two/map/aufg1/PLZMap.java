package generics_two.map.aufg1;

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
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\E544157\\sbbJavaREAL\\src\\generics_two\\map\\Postleitzahlen_UTF8.csv";
        String line = "";
        String cvsSplitBy = ",";
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] values = line.split(cvsSplitBy);
                data.put(values[0], values[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("- Anzahl PLZ: " + data.size());
        smallestPLZ("Bern");
        largestPLZ("Bern");
        gemeindenWithNLetters(5);
        gemeindenWithSubstr("ent");
        gemeindenByLetterCount(true, 4);

    }

    public static void smallestPLZ(String gemeinde) {
        String smallestPLZ = data.entrySet().stream()
                .filter(entry -> entry.getValue().equals(gemeinde))
                .map(Map.Entry::getKey)
                .min(Comparator.naturalOrder())
                .orElse(null);
        if (smallestPLZ != null) {
            System.out.println("Kleinste PLZ der Gemeinde " + gemeinde + ": " + smallestPLZ + " " + gemeinde);
        } else {
            System.out.println("No PLZ found for Gemeinde " + gemeinde);
        }
    }

    public static void largestPLZ(String gemeinde) {
        String largestPLZ = data.entrySet().stream()
                .filter(entry -> entry.getValue().equals(gemeinde))
                .map(Map.Entry::getKey)
                .max(Comparator.naturalOrder())
                .orElse(null);
        if (largestPLZ != null) {
            System.out.println("Grösste PLZ der Gemeinde " + gemeinde + ": " + largestPLZ + " " + gemeinde);
        } else {
            System.out.println("No PLZ found for Gemeinde " + gemeinde);
        }
    }

    public static void gemeindenWithNLetters(int n) {
        long count = data.values().stream()
                .filter(value -> value.length() == n)
                .count();
        System.out.println("Anzahl Gemeinden mit " + n + " Buchstaben: " + count);
    }

    public static void gemeindenWithSubstr(String substr) {
        long count = data.values().stream()
                .filter(value -> value.contains(substr))
                .count();
        System.out.println("Anzahl Gemeinden mit der Buchstabenfolge '" + substr + "': " + count);
    }

    public static void gemeindenByLetterCount(boolean smallest, int count) {
        List<String> gemeinden = data.values().stream()
                .filter(value -> value.length() == count)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        if (gemeinden.isEmpty()) {
            System.out.println("No gemeinden found with " + count + " Buchstaben");
        } else {
            System.out.println("Gemeinden mit " + count + " Buchstaben: " + String.join(", ", gemeinden));
        }
        if (smallest) {
            int minCount = gemeinden.stream()
                    .map(String::length)
                    .min(Comparator.naturalOrder())
                    .orElse(0);
            List<String> smallestGemeinden = gemeinden.stream()
                    .filter(gemeinde -> gemeinde.length() == minCount)
                    .sorted(Comparator.naturalOrder())
                    .collect(Collectors.toList());
            if (!smallestGemeinden.isEmpty()) {
                System.out.println("Anzahl Buchstaben der kleinsten Gemeinden: " + minCount);
                System.out.println("Kleinsten Gemeinden: " + String.join(", ", smallestGemeinden));
            }
        } else {
            int maxCount = gemeinden.stream()
                    .map(String::length)
                    .max(Comparator.naturalOrder())
                    .orElse(0);
            /*List<String> largestGemeinden = (List <String>) gemeinden.stream()
                                                                     .filter(gemeinde -> gemeinde.length() == maxCount)
                                                                     .sorted();*/
        }
    }
}
/*
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class PLZMap {

    // existing code...

    public static void smallestPLZ(String gemeinde) {
        String smallestPLZ = data.entrySet().stream()
                .filter(entry -> entry.getValue().equals(gemeinde))
                .map(Entry::getKey)
                .min(Comparator.naturalOrder())
                .orElse(null);
        if (smallestPLZ != null) {
            System.out.println("Kleinste PLZ der Gemeinde " + gemeinde + ": " + smallestPLZ + " " + gemeinde);
        } else {
            System.out.println("No PLZ found for Gemeinde " + gemeinde);
        }
    }

    public static void largestPLZ(String gemeinde) {
        String largestPLZ = data.entrySet().stream()
                .filter(entry -> entry.getValue().equals(gemeinde))
                .map(Entry::getKey)
                .max(Comparator.naturalOrder())
                .orElse(null);
        if (largestPLZ != null) {
            System.out.println("Grösste PLZ der Gemeinde " + gemeinde + ": " + largestPLZ + " " + gemeinde);
        } else {
            System.out.println("No PLZ found for Gemeinde " + gemeinde);
        }
    }

    public static void gemeindenWithNLetters(int n) {
        long count = data.values().stream()
                .filter(value -> value.length() == n)
                .count();
        System.out.println("Anzahl Gemeinden mit " + n + " Buchstaben: " + count);
    }

    public static void gemeindenWithSubstr(String substr) {
        long count = data.values().stream()
                .filter(value -> value.contains(substr))
                .count();
        System.out.println("Anzahl Gemeinden mit der Buchstabenfolge '" + substr + "': " + count);
    }

    public static void gemeindenByLetterCount(boolean smallest, int count) {
        List<String> gemeinden = data.values().stream()
                .filter(value -> value.length() == count)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        if (gemeinden.isEmpty()) {
            System.out.println("No gemeinden found with " + count + " Buchstaben");
        } else {
            System.out.println("Gemeinden mit " + count + " Buchstaben: " + String.join(", ", gemeinden));
        }
        if (smallest) {
            int minCount = gemeinden.stream()
                    .map(String::length)
                    .min(Comparator.naturalOrder())
                    .orElse(0);
            List<String> smallestGemeinden = gemeinden.stream()
                    .filter(gemeinde -> gemeinde.length() == minCount)
                    .sorted(Comparator.naturalOrder())
                    .collect(Collectors.toList());
            if (!smallestGemeinden.isEmpty()) {
                System.out.println("Anzahl Buchstaben der kleinsten Gemeinden: " + minCount);
                System.out.println("Kleinsten Gemeinden: " + String.join(", ", smallestGemeinden));
            }
        } else {
            int maxCount = gemeinden.stream()
                    .map(String::length)
                    .max(Comparator.naturalOrder())
                    .orElse(0);
            List<String> largestGemeinden = gemeinden.stream()
                    .filter(gemeinde -> gemeinde.length() == maxCount)
                    .sorted(Comparator
 */