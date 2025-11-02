interface Discountable {
    double applyDiscount(double total);
    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String name, double price, int qty) {
        this.itemName = name;
        this.price = price;
        this.quantity = qty;
    }

    
    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void getItemDetails() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity);
    }

    public abstract double calculateTotalPrice();
}


class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity(); 
    }

    @Override
    public double applyDiscount(double total) {
        return total * 0.9; 
    }

    @Override
    public String getDiscountDetails() {
        return "10% discount applied on Veg items.";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + 50; 
    }

    @Override
    public double applyDiscount(double total) {
        return total * 0.95; 
    }

    @Override
    public String getDiscountDetails() {
        return "5% discount applied on Non-Veg items.";
    }
}


public class ques6 {
    public static void processOrder(FoodItem[] order) {
        double grandTotal = 0;

        for (FoodItem item : order) {
            item.getItemDetails();

            double total = item.calculateTotalPrice();
            double finalPrice = ((Discountable)item).applyDiscount(total);

            System.out.println(((Discountable)item).getDiscountDetails());
            System.out.println("Total Price (before discount): " + total);
            System.out.println("Final Price (after discount): " + finalPrice);
            System.out.println("----------------------------------");

            grandTotal += finalPrice;
        }

        System.out.println("Grand Total for Order: " + grandTotal);
    }

    public static void main(String[] args) {
        FoodItem[] order = {
            new VegItem("Paneer Butter Masala", 200, 2),
            new NonVegItem("Chicken Biryani", 250, 3)
        };

        processOrder(order); // Polymorphism: one method handles all item types
    }
}
