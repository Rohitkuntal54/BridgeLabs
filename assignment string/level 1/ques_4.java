public class ques_4{

    // Method that generates NullPointerException
    public static void ques_4() {
        String text = null;

        // This will throw NullPointerException
        System.out.println("Length of text: " + text.length());
    }

    // Method that handles NullPointerException using try-catch
    public static void handleNullPointer() {
        String text = null;

        try {
            // Attempting to call a method on null
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException!");
            System.out.println("Error Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Generating NullPointerException ===");
        try {
            generateNullPointer();  // This will throw the exception
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("\n=== Handling NullPointerException Gracefully ===");
        handleNullPointer();  // This will catch and handle the exception
    }
}

