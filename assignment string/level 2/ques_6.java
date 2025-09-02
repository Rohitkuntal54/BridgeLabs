import java.util.Scanner;

public class ques_6 {

    // Method to check character type: Vowel, Consonant or Not a Letter
    public static String checkCharType(char ch) {
        // Convert uppercase to lowercase using ASCII (A=65, a=97)
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }

        // Check if character is a letter
        if (ch >= 'a' && ch <= 'z') {
            // Check vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Method to analyze each character and return 2D array [char, type]
    public static String[][] analyzeString(String text) {
        int length = 0;
        // Calculate length without using length() method, via charAt and exception
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // end of string reached
        }

        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharType(ch);
        }

        return result;
    }

    // Method to display the 2D array in tabular format
    public static void displayResult(String[][] data) {
        System.out.printf("%-10s | %-15s\n", "Character", "Character Type");
        System.out.println("-----------------------------");
        for (String[] row : data) {
            System.out.printf("%-10s | %-15s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] analyzedData = analyzeString(input);

        displayResult(analyzedData);

        scanner.close();
    }
}

