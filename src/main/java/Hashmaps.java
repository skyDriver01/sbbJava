package main.java;

import java.util.HashMap;

public class Hashmaps {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);   //Gibt alle werte aus wie das Land und die Hauptstadt
        System.out.println(capitalCities.get("USA")); //Gibt nur die Hauptstadt von diesem Land an
        //kann auch .clear machen damit alles im hash gelöscht wird. mir .remove kann man auswählen was gelöscht werden soll
        for (String i : capitalCities.keySet()) {       //keySet() ist nur für die keys(die Länder in dem fall)
            System.out.println(i);                      //values() ist nur für die werte/values(die Hauptstädte in diesem fall)
        }
    }
}