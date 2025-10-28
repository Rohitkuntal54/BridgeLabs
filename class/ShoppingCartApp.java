<<<<<<< HEAD
package com.bridgelabz.oops.levelone;

import java.util.ArrayList;
import java.util.Iterator;

class CartItem {

    String itemName;
    double price;
    int quantity;

    
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }
}

class ShoppingCart {
    
    ArrayList<CartItem> cartItems = new ArrayList<>();

    
    public void addItem(String itemName, double price, int quantity) {
        CartItem item = new CartItem(itemName, price, quantity);
        cartItems.add(item);
        System.out.println("Added " + quantity + " x " + itemName + " to the cart.");
    }

    
    public void removeItem(String itemName) {
        Iterator<CartItem> iterator = cartItems.iterator();
        boolean found = false;

        while (iterator.hasNext()) {
            CartItem item = iterator.next();
            if (item.itemName.equalsIgnoreCase(itemName)) {
                iterator.remove();
                System.out.println(itemName + " removed from the cart.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(itemName + " not found in the cart.");
        }
    }


    public void displayTotalCost() {
        double total = 0;
        System.out.println("\n--- Cart Summary ---");
        for (CartItem item : cartItems) {
            System.out.println(item.quantity + " x " + item.itemName + " @ ₹" + item.price + " each = ₹" + item.getTotalPrice());
            total += item.getTotalPrice();
        }
        System.out.println("Total Cost: ₹" + total);
    }
}

public class ShoppingCartApp {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Laptop", 55000, 1);
        cart.addItem("Mouse", 700, 2);
        cart.addItem("Notebook", 40, 5);

    
        cart.removeItem("Mouse");

        
        cart.displayTotalCost();
    }
}
=======
package com.bridgelabz.oops.levelone;

import java.util.ArrayList;
import java.util.Iterator;

class CartItem {

    String itemName;
    double price;
    int quantity;

    
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }
}

class ShoppingCart {
    
    ArrayList<CartItem> cartItems = new ArrayList<>();

    
    public void addItem(String itemName, double price, int quantity) {
        CartItem item = new CartItem(itemName, price, quantity);
        cartItems.add(item);
        System.out.println("Added " + quantity + " x " + itemName + " to the cart.");
    }

    
    public void removeItem(String itemName) {
        Iterator<CartItem> iterator = cartItems.iterator();
        boolean found = false;

        while (iterator.hasNext()) {
            CartItem item = iterator.next();
            if (item.itemName.equalsIgnoreCase(itemName)) {
                iterator.remove();
                System.out.println(itemName + " removed from the cart.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(itemName + " not found in the cart.");
        }
    }


    public void displayTotalCost() {
        double total = 0;
        System.out.println("\n--- Cart Summary ---");
        for (CartItem item : cartItems) {
            System.out.println(item.quantity + " x " + item.itemName + " @ ₹" + item.price + " each = ₹" + item.getTotalPrice());
            total += item.getTotalPrice();
        }
        System.out.println("Total Cost: ₹" + total);
    }
}

public class ShoppingCartApp {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Laptop", 55000, 1);
        cart.addItem("Mouse", 700, 2);
        cart.addItem("Notebook", 40, 5);

    
        cart.removeItem("Mouse");

        
        cart.displayTotalCost();
    }
}
>>>>>>> 2a3bf8e (first)
