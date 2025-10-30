public class ques6 {

   
    public static double getRemainingLimit(Double limit, double usedAmount) {
        
        if (limit == null) {
            return 0.0;
        }
        
        double remaining = limit - usedAmount;
        return remaining >= 0 ? remaining : 0.0; 
    }

    public static void main(String[] args) {
       
        Double limit1 = 1000.0; 
        Double limit2 = null;  
        double used = 250.0;    
        System.out.println("--- Bank Transaction Limits ---");
        System.out.println("Remaining limit (limit1): " + getRemainingLimit(limit1, used));
        System.out.println("Remaining limit (limit2): " + getRemainingLimit(limit2, used));
        double primitiveLimit = 500.0;
        System.out.println("Remaining limit (primitiveLimit): " + getRemainingLimit(primitiveLimit, used));
    }
}

