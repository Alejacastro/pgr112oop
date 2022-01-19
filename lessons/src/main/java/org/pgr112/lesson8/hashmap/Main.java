package org.pgr112.lesson8.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("Netherlands", "Amsterdam");
        capitalCities.put("Netherlands", "Hague");
        System.out.println(capitalCities);

        System.out.println("-------");

        for (Map.Entry<String, String> entry :
                capitalCities.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        capitalCities.get("Netherlands");

    }
}
