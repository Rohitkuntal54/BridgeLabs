import java.util.HashSet;
import java.util.Scanner;

public class ques_8 {

    // Method to generate a 6-digit OTP number using Math.random()
    public static int generate6DigitOTP() {
        // Generate random number between 100000 and 999999 (inclusive)
        return (int)(Math.random() * 900000) + 100000;
    }

    // Method to check if all OTPs in the array are unique
    public static boolean areOTPsUnique(int[] otps) {
        HashSet<Integer> set = new HashSet<>();
        for (int otp : otps) {
            if (!set.add(otp)) {
                // If add returns false, OTP is duplicate
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10];

        System.out.println("Generating 10 six-digit OTPs:");
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generate6DigitOTP();
            System.out.println("OTP " + (i + 1) + ": " + otpArray[i]);
        }

        if (areOTPsUnique(otpArray)) {
            System.out.println("All OTPs generated are unique.");
        } else {
            System.out.println("There are duplicate OTPs generated.");
        }
    }
}

