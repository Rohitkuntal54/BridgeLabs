public class ques4 {
    public static void main(String[] args) {
        
        String[] priceStrings = {"250", "499", "99", "abc", "150"};

        int total = 0; 
        System.out.println("--- Shopping Cart Price Calculation ---");

       
        for (String price : priceStrings) {
            try {
               
                int value = Integer.parseInt(price);
                total += value; // add to total
                System.out.println("Added item price: " + value);
            } catch (NumberFormatException e) {
                
                System.out.println("Invalid price \"" + price + "\" skipped.");
            }
        }

        
        System.out.println("\nTotal Price of Valid Items = " + total);
    }
}
