public class ques2 {
    public static void main(String[] args) {
        
        Double doubleObj = 45.67;
        double doubleValue = doubleObj.doubleValue();
        int intValue = (int) doubleObj.doubleValue();
        System.out.println("--- Wrapper to Primitive Conversion ---");
        System.out.println("Wrapper object value (Double): " + doubleObj);
        System.out.println("Primitive double value: " + doubleValue);
        System.out.println("Primitive int value (after casting): " + intValue);
    }
}

