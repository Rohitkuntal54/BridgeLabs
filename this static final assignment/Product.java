public class Product {
   
    private static double discount = 10.0; 
    
    
    private String productName;
    private final int productID;  
    private double price;
    private int quantity;

   
    public Product(String productName, int productID, double price, int quantity) {
        this.productName = productName;
        this.productID = productID;
        this.price = price;
        this.quantity = quantity;
    }

    
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount + "%");
    }

   
    public double calculateTotalPrice() {
        return quantity * price * (1 - discount / 100);
    }

  
    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: ₹" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Total Price after discount: ₹" + calculateTotalPrice());
            System.out.println("----------------------------------");
        } else {
            System.out.println("Invalid Product object!");
        }
    }

  
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 101, 50000, 1);
        Product p2 = new Product("Headphones", 102, 1500, 2);

     
        p1.displayProductDetails();
        p2.displayProductDetails();

        Product.updateDiscount(15);

       
        p1.displayProductDetails();
        p2.displayProductDetails();
    }
}
