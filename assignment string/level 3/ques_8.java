import java.util.Scanner;

public class ques_8 {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Remove spaces and convert to lowercase for accurate comparison
        text1 = text1.replaceAll("\\s+", "").toLowerCase();
        text2 = text2.replaceAll("\\s+", "").toLowerCase();

        // Check if lengths are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        int[] freq1 = new int[256]; // Frequency array for first text (ASCII chars)
        int[] freq2 = new int[256]; // Frequency array for second text

        // Count frequency of each character in text1
        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i)]++;
        }

        // Count frequency of each character in text2
        for (int i = 0; i < text2.length(); i++) {
            freq2[text2.charAt(i)]++;
        }

        // Compare frequency arrays
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first text: ");
        String firstText = scanner.nextLine();

        System.out.print("Enter second text: ");
        String secondText = scanner.nextLine();

        boolean result = areAnagrams(firstText, secondText);

        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are NOT anagrams.");
        }

        scanner.close();
    }
}

