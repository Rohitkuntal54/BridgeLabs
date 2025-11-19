import java.util.*;

public class Q7_CountryCapital {
    public static void main(String[] args) {
        Map<String, String> cap = new HashMap<>();

        cap.put("India", "New Delhi");
        cap.put("USA", "Washington");
        cap.put("Japan", "Tokyo");
        cap.put("UK", "London");
        cap.put("Germany", "Berlin");
        cap.put("France", "Paris");
        cap.put("China", "Beijing");
        cap.put("Russia", "Moscow");

        String country = "Japan";
        System.out.println(cap.getOrDefault(country, "Unknown country"));

        TreeMap<String, String> sorted = new TreeMap<>(cap);
        for (String c : sorted.keySet()) {
            System.out.println(c + " → " + sorted.get(c));
        }
    }
}
