import java.util.*;

public class Q11_Banking {
    public static void main(String[] args) {
        Map<String, Double> bal = new HashMap<>();

        bal.put("A101", 5000.0);
        bal.put("A102", 20000.0);
        bal.put("A103", 12000.0);
        bal.put("A104", 9000.0);

        // Deposit
        bal.put("A101", bal.get("A101") + 2000);

        // Withdrawal
        double amt = 15000;
        if (bal.get("A102") >= amt)
            bal.put("A102", bal.get("A102") - amt);
        else
            System.out.println("Insufficient balance");

        // Sort descending balance
        bal.entrySet().stream()
                .sorted((a, b) -> Double.compare(b.getValue(), a.getValue()))
                .forEach(e -> System.out.println(e.getKey() + " → " + e.getValue()));

        // Top 3
        System.out.println("Top 3 customers:");
        bal.entrySet().stream()
                .sorted((a, b) -> Double.compare(b.getValue(), a.getValue()))
                .limit(3)
                .forEach(e -> System.out.println(e.getKey()));
    }
}
