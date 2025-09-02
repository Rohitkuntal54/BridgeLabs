import java.util.Scanner;

public class ques_9{

    // Array to store month names
    static String[] months = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Array to store days in each month for a non-leap year
    static int[] daysInMonth = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    // Method to get month name
    public static String getMonthName(int month) {
        return months[month - 1];
    }

    // Method to check leap year
    public static boolean isLeapYear(int year) {
        if ((year % 400) == 0) {
            return true;
        }
        if ((year % 4) == 0 && (year % 100) != 0) {
            return true;
        }
        return false;
    }

    // Method to get number of days in the month
    public static int getNumberOfDays(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }

    // Method to get the first day of the month (0=Sunday, 1=Monday,...6=Saturday)
    public static int getFirstDay(int month, int year) {
        // Gregorian calendar algorithm

        int y0 = year - (14 - month) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;

        return d0;  // 0=Sunday, 1=Monday, ..., 6=Saturday
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        System.out.println("     " + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDay(month, year);
        int numDays = getNumberOfDays(month, year);

        // Print spaces for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");  // 4 spaces for each day slot
        }

        for (int day = 1; day <= numDays; day++) {
            System.out.printf("%3d ", day);

            // Move to next line after Saturday
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println(); // New line at the end
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter year (e.g., 2023): ");
        int year = scanner.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month. Please enter a value between 1 and 12.");
            return;
        }

        displayCalendar(month, year);

        scanner.close();
    }
}

