import java.util.Scanner;

public class ques_3 {

    // Method to find length of a string without using length()
    public static int findLengthWithoutLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Reached end of string
        }
        return count;
    }

    // Method to split text into words using charAt() without split()
    public static String[] splitWithoutSplit(String text) {
        int length = findLengthWithoutLength(text);

        // Count spaces to determine number of words
        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int wordsCount = spaceCount + 1;
        int[] spaceIndexes = new int[spaceCount];
        int spaceIndexCounter = 0;

        // Store indexes of spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[spaceIndexCounter++] = i;
            }
        }

        String[] words = new String[wordsCount];

        // Extract words using charAt()
        int start = 0;
        for (int w = 0; w < wordsCount; w++) {
            int end = (w == spaceCount) ? length : spaceIndexes[w];

            StringBuilder word = new StringBuilder();
            for (int i = start; i < end; i++) {
                word.append(text.charAt(i));
            }
            words[w] = word.toString();

            start = end + 1; // Next word starts after the space
        }

        return words;
    }

    // Method to create 2D array of words and their lengths (length as String)
    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i]; // word
            int len = findLengthWithoutLength(words[i]);
            result[i][1] = String.valueOf(len); // length as String
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take full line input
        System.out.print("Enter a line of text: ");
        String inputText = scanner.nextLine();

        // Split the text into words
        String[] words = splitWithoutSplit(inputText);

        // Get 2D array of words and lengths
        String[][] wordsLengths = wordsWithLengths(words);

        // Display the result in tabular format
        System.out.println("\nWord\t\tLength");
        System.out.println("-----------------------");

        for (String[] row : wordsLengths) {
            // Convert length string back to int for display (optional, but per instruction)
            int length = Integer.parseInt(row[1]);
            System.out.printf("%-15s %d\n", row[0], length);
        }

        scanner.close();
    }
}
