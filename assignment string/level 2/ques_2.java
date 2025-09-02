import java.util.Scanner;

public class ques_2 {

    // Method to find length of string without using length()
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

    // Method to split the text into words without using split()
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

        // Extract first word: from 0 to first space or end of string if no spaces
        int start = 0;
        for (int w = 0; w < wordsCount; w++) {
            int end;
            if (w == spaceCount) {
                // Last word goes till end of string
                end = length;
            } else {
                end = spaceIndexes[w];
            }

            // Build word using charAt from start to end - 1
            StringBuilder word = new StringBuilder();
            for (int i = start; i < end; i++) {
                word.append(text.charAt(i));
            }
            words[w] = word.toString();

            start = end + 1; // next word starts after the space
        }

        return words;
    }

    // Method to compare two string arrays and return boolean
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String inputText = scanner.nextLine();

        // Split using user-defined method
        String[] manualSplit = splitWithoutSplit(inputText);

        // Split using built-in method
        String[] builtInSplit = inputText.split(" ");

        // Compare both arrays
        boolean isEqual = compareStringArrays(manualSplit, builtInSplit);

        // Display results
        System.out.println("\n=== Manual Split Result ===");
        for (String word : manualSplit) {
            System.out.println(word);
        }

        System.out.println("\n=== Built-in Split Result ===");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        System.out.println("\nComparison Result: " + (isEqual ? "✅ Both arrays are equal." : "❌ Arrays differ."));

        scanner.close();
    }
}

