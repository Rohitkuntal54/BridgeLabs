import java.util.Scanner;

public class ques_9 {

    // Array of month names
    static String[] months = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Number of days in each month (for non-leap year)
    static int[] daysInMonth = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    // Method to get the month name from month number (1-12)
    public static String getMonthName(int month) {
        if (month >= 1 && month <= 12) {
            return months[month - 1];
        }
        return "Invalid Month";
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

    // Method to get the number of days in a given month and year
    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }

    // Method to calculate the first day of the month (0=Sunday, 1=Monday,...6=Saturday)
    // Using Zeller's Congruence algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        if (month < 3) {
            month += 12;
            year--;
        }
        int q = 1; // Day of month
        int m = month;
        int k = year % 100;
        int j = year / 100;

        int h = (q + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + 5 * j) % 7;
        // Zeller's formula outputs: 0=Saturday, 1=Sunday, ..., 6=Friday
        // We convert it to: 0=Sunday, 1=Monday,...6=Saturday by:
        int day = (h + 6) % 7;
        return day;
    }

    // Method to print the calendar for a given month and year
    public static void printCalendar(int month, int year) {
        System.out.println("    " + getMonthName(month) + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        int firstDay = getFirstDayOfMonth(month, year);
        int days = getDaysInMonth(month, year);

        // Print initial spaces for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("   "); // 3 spaces for alignment
        }

        // Print all days of the month
        for (int day = 1; day <= days; day++) {
            System.out.printf("%2d ", day);

            // Move to next line after Saturday (6)
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println(); // final newline
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter year (e.g. 2023): ");
        int year = scanner.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month entered.");
            return;
        }
        if (year < 1) {
            System.out.println("Invalid year entered.");
            return;
        }

        printCalendar(month, year);
    }
}

