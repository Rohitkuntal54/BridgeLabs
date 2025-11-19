import java.util.*;

public class Q2_Inventory {
    public static void main(String[] args) {
        Map<String, Integer> stock = new HashMap<>();

        // Add products
        stock.put("Soap", 30);
        stock.put("Shampoo", 20);
        stock.put("Oil", 50);

        // Customer buys
        stock.put("Soap", stock.get("Soap") - 30); // becomes 0 → remove
        if (stock.get("Soap") <= 0) stock.remove("Soap");

        // New shipment
        stock.put("Shampoo", stock.get("Shampoo") + 15);

        // Query
        String product = "Oil";
        System.out.println(stock.containsKey(product) ?
                stock.get(product) : "Not stocked");

        // Print out-of-stock
        System.out.println("Out of stock items:");
        for (String key : stock.keySet()) {
            if (stock.get(key) == 0) System.out.println(key);
        }
    }
}
