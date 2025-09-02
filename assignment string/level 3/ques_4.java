import java.util.Scanner;

public class ques_4 {

    // Method to find length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    // Method to find frequency of characters and return as 2D array
    public static String[][] findCharFrequency(String text) {
        int[] frequency = new int[256];  // ASCII character frequency
        int length = findLength(text);

        // Count frequency
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        // Count unique characters to size the 2D array
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        // Create 2D array for characters and their frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = Character.toString((char)i);
                result[index][1] = Integer.toString(frequency[i]);
                index++;
            }
        }

        return result;
    }

    // Method to display the 2D array in tabular format
    public static void displayFrequency(String[][] freqArr) {
        System.out.println("Character | Frequency");
        System.out.println("---------------------");
        for (int i = 0; i < freqArr.length; i++) {
            System.out.printf("    %s     |    %s\n", freqArr[i][0], freqArr[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] frequency = findCharFrequency(input);

        displayFrequency(frequency);

        scanner.close();
    }
}

