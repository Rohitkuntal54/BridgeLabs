package selfproblem;

import java.util.*;

class Product {
    private String id;
    private String name;
    private double price;

    public Product(String id, String name, double price) {
        this.id = id; this.name = name; this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }

    public void display() {
        System.out.println(name + " (ID: " + id + ") - ₹" + price);
    }
}

class Order {
    String orderId;
    private List<Product> products;
    private double total;

    public Order(String orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
        this.total = 0.0;
    }

    public void addProduct(Product p) {
        products.add(p);
        total += p.getPrice();
    }

    public double getTotal() { return total; }

    public void showOrder() {
        System.out.println("Order: " + orderId);
        for (Product p : products) p.display();
        System.out.println("Total: ₹" + total);
    }
}

class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name; this.orders = new ArrayList<>();
    }

    public void placeOrder(Order o) {
        orders.add(o);
        System.out.println(name + " placed order " + o.orderId + " (₹" + o.getTotal() + ")");
    }

    public void showOrders() {
        System.out.println("Orders of " + name + ":");
        for (Order o : orders) {
            o.showOrder();
            System.out.println();
        }
    }
}

public class EcommerceExample {
    public static void main(String[] args) {
        Product p1 = new Product("P001", "Wireless Mouse", 499.0);
        Product p2 = new Product("P002", "USB-C Charger", 799.0);
        Product p3 = new Product("P003", "Notebook", 199.0);

        Customer c = new Customer("Ayush");

        Order o1 = new Order("ORD1001");
        o1.addProduct(p1);
        o1.addProduct(p3);

        Order o2 = new Order("ORD1002");
        o2.addProduct(p2);

        c.placeOrder(o1);
        c.placeOrder(o2);

        System.out.println();
        c.showOrders();
    }
}
