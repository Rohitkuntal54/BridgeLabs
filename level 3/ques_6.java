import java.util.Scanner;

public class ques_6 {

    // Method to find frequency of characters using nested loops
    public static String[] findFrequency(String text) {
        char[] chars = text.toCharArray();
        int length = chars.length;
        int[] freq = new int[length];

        // Initialize frequency array
        for (int i = 0; i < length; i++) {
            freq[i] = 1;
        }

        // Nested loops to count frequency and mark duplicates as '0'
        for (int i = 0; i < length; i++) {
            if (chars[i] == '0') continue; // Skip already counted duplicates

            for (int j = i + 1; j < length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // Mark duplicate
                }
            }
        }

        // Count how many unique chars (freq[i] != 0)
        int uniqueCount = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] != '0') {
                uniqueCount++;
            }
        }

        // Prepare the result array (character and frequency as a string)
        String[] result = new String[uniqueCount];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + " : " + freq[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[] frequency = findFrequency(input);

        System.out.println("Character frequencies:");
        for (String s : frequency) {
            System.out.println(s);
        }

        scanner.close();
    }
}

