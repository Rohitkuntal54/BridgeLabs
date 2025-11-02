interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.productId = id;
        this.name = name;
        this.price = price;
    }

    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public abstract double calculateDiscount();

    public void displayDetails() {
        System.out.println("Product ID: " + productId + ", Name: " + name + ", Price: " + price);
    }
}


class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) { super(id, name, price); }

    public double calculateDiscount() { return getPrice() * 0.10; }
    public double calculateTax() { return getPrice() * 0.18; }
    public String getTaxDetails() { return "18% GST on Electronics"; }
}


class Clothing extends Product implements Taxable {
    public Clothing(int id, String name, double price) { super(id, name, price); }

    public double calculateDiscount() { return getPrice() * 0.20; }
    public double calculateTax() { return getPrice() * 0.05; }
    public String getTaxDetails() { return "5% GST on Clothing"; }
}

class Groceries extends Product {
    public Groceries(int id, String name, double price) { super(id, name, price); }

    public double calculateDiscount() { return getPrice() * 0.05; }
}

public class ques2 {
    public static void printFinalPrices(Product[] products) {
        for (Product p : products) {
            p.displayDetails();
            double discount = p.calculateDiscount();
            double tax = (p instanceof Taxable) ? ((Taxable)p).calculateTax() : 0;
            double finalPrice = p.getPrice() + tax - discount;

            System.out.println("Discount: " + discount);
            if (p instanceof Taxable)
                System.out.println(((Taxable)p).getTaxDetails());
            System.out.println("Final Price: " + finalPrice);
            System.out.println("----------------------------------");
        }
    }

    public static void main(String[] args) {
        Product[] products = {
            new Electronics(1, "Laptop", 80000),
            new Clothing(2, "Jacket", 3000),
            new Groceries(3, "Apples", 500)
        };

        printFinalPrices(products);
    }
}
