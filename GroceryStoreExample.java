package classobject;
import java.util.ArrayList;
import java.util.List;

// Product class
class Product {
    private String name;
    private int quantity;
    private double pricePerUnit;

    public Product(String name, int quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public double getTotalPrice() {
        return quantity * pricePerUnit;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }
}

// Customer class (composes Products)
class Customer {
    private String name;
    private List<Product> purchasedProducts;

    public Customer(String name) {
        this.name = name;
        this.purchasedProducts = new ArrayList<>();
    }

    public void addProduct(Product product) {
        purchasedProducts.add(product);
    }

    public List<Product> getPurchasedProducts() {
        return purchasedProducts;
    }

    public String getName() {
        return name;
    }
}

// BillGenerator class
class BillGenerator {
    public double generateBill(Customer customer) {
        double total = 0;
        for (Product p : customer.getPurchasedProducts()) {
            total += p.getTotalPrice();
        }
        return total;
    }
}

// Demo
public class GroceryStoreExample {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Alice");
        customer1.addProduct(new Product("Apples", 2, 3.0)); // 2 kg × $3
        customer1.addProduct(new Product("Milk", 1, 2.0));   // 1 L × $2

        BillGenerator billGen = new BillGenerator();
        double totalBill = billGen.generateBill(customer1);

        System.out.println("Customer: " + customer1.getName());
        for (Product p : customer1.getPurchasedProducts()) {
            System.out.println(p.getName() + " - Qty: " + p.getQuantity() + ", Price/unit: $" + p.getPricePerUnit());
        }
        System.out.println("Total Bill: $" + totalBill);
    }
}
