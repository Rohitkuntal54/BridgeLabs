import java.util.Arrays;

public class ques_3 {

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

    // Method to find sum of digits using digits array
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    // Method to find sum of squares of digits using digits array
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    // Harshad number is divisible by sum of its digits
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sumDigits = sumOfDigits(digits);
        if (sumDigits == 0) return false;  // avoid division by zero
        return Math.abs(number) % sumDigits == 0;
    }

    // Method to find frequency of each digit
    // Returns 2D array where first column is digit and second column is frequency
    public static int[][] digitFrequency(int[] digits) {
        int[] freq = new int[10]; // digit 0-9 frequency
        for (int d : digits) {
            freq[d]++;
        }

        // Count how many unique digits present
        int uniqueDigits = 0;
        for (int f : freq) {
            if (f > 0) uniqueDigits++;
        }

        int[][] freqArray = new int[uniqueDigits][2];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                freqArray[index][0] = i;
                freqArray[index][1] = freq[i];
                index++;
            }
        }
        return freqArray;
    }

    public static void main(String[] args) {
        int number = 21;  // Example number, you can change it

        System.out.println("Number: " + number);

        int count = countDigits(number);
        System.out.println("Count of digits: " + count);

        int[] digits = digitsArray(number);
        System.out.println("Digits array: " + Arrays.toString(digits));

        int sumDigits = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sumDigits);

        int sumSquares = sumOfSquaresOfDigits(digits);
        System.out.println("Sum of squares of digits: " + sumSquares);

        boolean harshad = isHarshadNumber(number, digits);
        System.out.println("Is Harshad number? " + harshad);

        int[][] freqArray = digitFrequency(digits);
        System.out.println("Digit frequencies:");
        for (int[] pair : freqArray) {
            System.out.println("Digit " + pair[0] + " appears " + pair[1] + " times");
        }
    }
}
