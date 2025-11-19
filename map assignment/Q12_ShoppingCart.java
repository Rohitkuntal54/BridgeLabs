 
import java.util.*;

public class Q12_ShoppingCart {
    public static void main(String[] args) {
        Map<String, Double> cart = new LinkedHashMap<>();

        cart.put("Laptop", 40000.0);
        cart.put("Mouse", 500.0);
        cart.put("Keyboard", 1500.0);

        // Display in order
        for (String p : cart.keySet()) {
            System.out.println(p + " → " + cart.get(p));
        }

        // Total
        double total = 0;
        for (double price : cart.values()) total += price;

        if (total > 5000) total *= 0.90;
        System.out.println("Final total = " + total);

        // Remove item
        cart.remove("Mouse");
    }
}

