import java.util.Scanner;

public class ques_5{

    // Method to check if a character is vowel, consonant or not a letter
    public static String checkCharType(char ch) {
        // Convert uppercase to lowercase using ASCII if needed
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }

        // Check if character is letter
        if (ch >= 'a' && ch <= 'z') {
            // Check vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Method to find vowels and consonants count in a string
    // Returns int array: [vowelCount, consonantCount]
    public static int[] countVowelsConsonants(String text) {
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; ; i++) {
            try {
                char ch = text.charAt(i);
                String type = checkCharType(ch);
                if (type.equals("Vowel")) {
                    vowels++;
                } else if (type.equals("Consonant")) {
                    consonants++;
                }
            } catch (IndexOutOfBoundsException e) {
                // Reached end of string
                break;
            }
        }

        return new int[] {vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Get counts of vowels and consonants
        int[] counts = countVowelsConsonants(input);

        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);

        scanner.close();
    }
}

