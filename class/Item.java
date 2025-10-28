<<<<<<< HEAD
package com.bridgelabz.oops.levelone;

class Item {
    
    int itemCode;
    String itemName;
    double price;

    
    public void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Unit: ₹" + price);
    }

    
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        
        Item item = new Item();
        item.itemCode = 101;
        item.itemName = "USB Flash Drive";
        item.price = 799.50;

        
        item.displayItemDetails();

    
        int quantity = 3;
        double totalCost = item.calculateTotalCost(quantity);
        System.out.println("Total cost for " + quantity + " units: ₹" + totalCost);
    }
}

=======
package com.bridgelabz.oops.levelone;

class Item {
    
    int itemCode;
    String itemName;
    double price;

    
    public void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Unit: ₹" + price);
    }

    
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        
        Item item = new Item();
        item.itemCode = 101;
        item.itemName = "USB Flash Drive";
        item.price = 799.50;

        
        item.displayItemDetails();

    
        int quantity = 3;
        double totalCost = item.calculateTotalCost(quantity);
        System.out.println("Total cost for " + quantity + " units: ₹" + totalCost);
    }
}

>>>>>>> 2a3bf8e (first)
