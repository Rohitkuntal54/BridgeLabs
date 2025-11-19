import java.util.*;

public class Q3_Voting {
    public static void main(String[] args) {
        Map<String, Integer> votes = new HashMap<>();
        String[] cast = {"A", "B", "A", "C", "A", "B", "A", "C", "C", "C"};

        for (String c : cast) {
            votes.put(c, votes.getOrDefault(c, 0) + 1);
        }

        // Print votes
        for (String c : votes.keySet()) {
            System.out.println(c + " → " + votes.get(c));
        }

        // Highest votes
        String winner = "";
        int max = 0;

        for (String c : votes.keySet()) {
            if (votes.get(c) > max) {
                max = votes.get(c);
                winner = c;
            }
        }

        System.out.println("Winner = " + winner);
    }
}

