import java.util.Arrays;

public class ques_4 {

    // Method to find count of digits in a number
    public static int countDigits(int number) {
        if (number == 0) return 1;
        int count = 0;
        int n = Math.abs(number);
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    // Method to store digits of a number in an array
    public static int[] digitsArray(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        int n = Math.abs(number);
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseDigitsArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean arraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    // Method to check if a number is palindrome using digits array
    public static boolean isPalindrome(int number) {
        int[] digits = digitsArray(number);
        int[] reversed = reverseDigitsArray(digits);
        return arraysEqual(digits, reversed);
    }

    // Method to check if a number is a duck number using digits array
    // A duck number has at least one non-zero digit
    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 12321;  // Test number, change as needed

        System.out.println("Number: " + number);

        int count = countDigits(number);
        System.out.println("Count of digits: " + count);

        int[] digits = digitsArray(number);
        System.out.println("Digits array: " + Arrays.toString(digits));

        int[] reversed = reverseDigitsArray(digits);
        System.out.println("Reversed digits array: " + Arrays.toString(reversed));

        boolean equal = arraysEqual(digits, reversed);
        System.out.println("Digits array equal to reversed? " + equal);

        boolean palindrome = isPalindrome(number);
        System.out.println("Is number palindrome? " + palindrome);

        boolean duck = isDuckNumber(digits);
        System.out.println("Is number a Duck number? " + duck);
    }
}

