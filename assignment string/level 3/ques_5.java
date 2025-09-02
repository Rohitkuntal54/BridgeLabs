import java.util.Scanner;

public class ques_5 {

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

    // Method to find unique characters using nested loops and charAt()
    public static char[] uniqueCharacters(String text) {
        int length = findLength(text);
        char[] temp = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if currentChar already in temp
            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create array with exact size for unique chars
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }
        return uniqueChars;
    }

    // Method to find frequency of characters using unique chars and return 2D array
    public static String[][] findFrequency(String text) {
        int length = findLength(text);
        char[] uniqueChars = uniqueCharacters(text);
        int uniqueCount = uniqueChars.length;

        // Count frequencies for each unique char
        int[] frequencies = new int[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            char ch = uniqueChars[i];
            int count = 0;
            for (int j = 0; j < length; j++) {
                if (text.charAt(j) == ch) {
                    count++;
                }
            }
            frequencies[i] = count;
        }

        // Store results in 2D String array: [character, frequency]
        String[][] result = new String[uniqueCount][2];
        for (int i = 0; i < uniqueCount; i++) {
            result[i][0] = Character.toString(uniqueChars[i]);
            result[i][1] = Integer.toString(frequencies[i]);
        }

        return result;
    }

    // Method to display frequency table
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

        String[][] frequency = findFrequency(input);

        displayFrequency(frequency);

        scanner.close();
    }
}

