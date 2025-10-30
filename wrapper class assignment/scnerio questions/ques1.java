public class ques1 {

    public static void main(String[] args) {
       
        String[] itemPrices = {"250", "499", "99", "abc", "150"};

        int totalPrice = 0; 
        System.out.println("--- Shopping Cart Price Calculation ---");

        
        for (String price : itemPrices) {
            try {
               
                int numericPrice = Integer.parseInt(price);
                totalPrice += numericPrice;
                System.out.println("Item price \"" + price + "\" added successfully.");
            } catch (NumberFormatException e) {
                
                System.out.println("Invalid price \"" + price + "\" skipped.");
            }
        }
        System.out.println("\nTotal Price of Valid Items = " + totalPrice);
    }
}

