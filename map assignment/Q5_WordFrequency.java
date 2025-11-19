import java.util.*;

public class Q5_WordFrequency {
    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful";

        Map<String, Integer> freq = new HashMap<>();

        for (String w : sentence.toLowerCase().split(" ")) {
            freq.put(w, freq.getOrDefault(w, 0) + 1);
        }

        for (String w : freq.keySet()) {
            System.out.println(w + " → " + freq.get(w));
        }
    }
}

