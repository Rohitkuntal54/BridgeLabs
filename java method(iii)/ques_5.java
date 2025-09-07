public class ques_5 {

    // Check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Helper method to get digits of a number
    public static int[] digitsArray(int number) {
        if (number == 0) return new int[]{0};
        int count = 0;
        int n = number;
        while (n > 0) {
            n /= 10;
            count++;
        }
        int[] digits = new int[count];
        n = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    // Sum of digits helper method
    public static int sumOfDigits(int number) {
        int sum = 0;
        int n = number;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    // Product of digits helper method
    public static int productOfDigits(int number) {
        int product = 1;
        int n = number;
        if (n == 0) return 0; // product of digits of 0 is 0
        while (n > 0) {
            product *= n % 10;
            n /= 10;
        }
        return product;
    }

    // Check if a number is neon
    // sum of digits of square == number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sumDigits = sumOfDigits(square);
        return sumDigits == number;
    }

    // Check if a number is spy (sum of digits == product of digits)
    public static boolean isSpy(int number) {
        int sum = sumOfDigits(number);
        int product = productOfDigits(number);
        return sum == product;
    }

    // Check if a number is automorphic
    // The square ends with the number itself
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String strNum = String.valueOf(number);
        String strSquare = String.valueOf(square);
        return strSquare.endsWith(strNum);
    }

    // Check if a number is buzz (divisible by 7 or ends with 7)
    public static boolean isBuzz(int number) {
        return (number % 7 == 0) || (number % 10 == 7);
    }

    public static void main(String[] args) {
        int[] testNumbers = {5, 7, 9, 153, 25, 49, 21, 13, 1, 0};

        for (int number : testNumbers) {
            System.out.println("Number: " + number);
            System.out.println("Is prime? " + isPrime(number));
            System.out.println("Is neon? " + isNeon(number));
            System.out.println("Is spy? " + isSpy(number));
            System.out.println("Is automorphic? " + isAutomorphic(number));
            System.out.println("Is buzz? " + isBuzz(number));
            System.out.println("------------------------------------------------");
        }
    }
}
