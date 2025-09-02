import java.util.Scanner;

public class ques_2 {

    // Method to find length of string without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while(true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    // Method to find unique characters using charAt()
    public static char[] findUniqueChars(String text) {
        int len = findLength(text);
        char[] temp = new char[len]; // Temporary array to store unique chars
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if currentChar appeared before
            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If unique, add to temp array
            if (isUnique) {
                temp[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create array of correct size to return
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        char[] uniqueChars = findUniqueChars(input);

        System.out.println("Unique characters in the string:");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        System.out.println();

        scanner.close();
    }
}

