public class ques3 {

    
    public static boolean isValidAge(String ageInput) {
        try {
            int age = Integer.parseInt(ageInput); 
            return age >= 18; 
        } catch (NumberFormatException e) {
            return false; 
        }
    }

    public static void main(String[] args) {
        
        String[] testAges = {"20", "17", "abc", "18", "-5", "30"};

        System.out.println("--- User Age Validation ---");
        for (String input : testAges) {
            boolean result = isValidAge(input);
            System.out.println("Input: \"" + input + "\" → Valid: " + result);
        }
    }
}

