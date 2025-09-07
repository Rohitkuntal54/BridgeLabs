public class ques_5{

    // Method to check if the given date falls in the Spring season
    public static boolean isSpringSeason(int month, int day) {
        // Check for each valid spring month with day boundaries
        return  (month == 3 && day >= 20 && day <= 31) ||
                (month == 4 && day >= 1 && day <= 30) ||
                (month == 5 && day >= 1 && day <= 31) ||
                (month == 6 && day >= 1 && day <= 20);
    }

    public static void main(String[] args) {
        // Check for correct number of arguments
        if (args.length < 2) {
            System.out.println("Please provide month and day as command line arguments.");
            return;
        }

        // Parse month and day from command line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Validate month and day range
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            System.out.println("Invalid date input.");
            return;
        }

        // Check if the date is in Spring season
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
