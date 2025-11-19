import java.util.*;

public class Q10_WebsiteTracker {
    public static void main(String[] args) {

        Map<String, Integer> visit = new HashMap<>();

        String[] pages = {
                "home","about","products","home","products",
                "contact","home","products","home"
        };

        for (String p : pages) {
            visit.put(p, visit.getOrDefault(p, 0) + 1);
        }

        // Sort by descending visits
        visit.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .forEach(e -> System.out.println(e.getKey() + " → " + e.getValue()));

        // Most visited
        String maxPage = "";
        int max = 0;
        for (String p : visit.keySet()) {
            if (visit.get(p) > max) {
                max = visit.get(p);
                maxPage = p;
            }
        }
        System.out.println("Most visited = " + maxPage);
    }
}
