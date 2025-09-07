public class ques_6 {

    // Method to find sum of proper divisors of a number
    public static int sumOfProperDivisors(int number) {
        if (number <= 1) return 0;
        int sum = 1; // 1 is always a proper divisor (except for number=1)
        int sqrt = (int) Math.sqrt(number);
        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0) {
                sum += i;
                int otherDivisor = number / i;
                if (otherDivisor != i) { // avoid adding sqrt twice if perfect square
                    sum += otherDivisor;
                }
            }
        }
        return sum;
    }

    // Check if number is perfect: sum of proper divisors == number
    public static boolean isPerfect(int number) {
        return number > 0 && sumOfProperDivisors(number) == number;
    }

    // Check if number is abundant: sum of proper divisors > number
    public static boolean isAbundant(int number) {
        return number > 0 && sumOfProperDivisors(number) > number;
    }

    // Check if number is deficient: sum of proper divisors < number
    public static boolean isDeficient(int number) {
        return number > 0 && sumOfProperDivisors(number) < number;
    }

    // Helper method to calculate factorial of a digit
    public static int factorial(int digit) {
        int fact = 1;
        for (int i = 2; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }

    // Check if number is strong: sum of factorials of digits == number
    public static boolean isStrong(int number) {
        int sum = 0;
        int n = number;
        while (n > 0) {
            int digit = n % 10;
            sum += factorial(digit);
            n /= 10;
        }
        return sum == number;
    }

    public static void main(String[] args) {
        int[] testNumbers = {6, 12, 15, 28, 5, 145, 1, 18, 496};

        for (int number : testNumbers) {
            System.out.println("Number: " + number);
            System.out.println("Is Perfect? " + isPerfect(number));
            System.out.println("Is Abundant? " + isAbundant(number));
            System.out.println("Is Deficient? " + isDeficient(number));
            System.out.println("Is Strong? " + isStrong(number));
            System.out.println("---------------------------------------");
        }
    }
}

