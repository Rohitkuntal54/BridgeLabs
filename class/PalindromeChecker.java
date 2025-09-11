package com.bridgelabz.oops.levelone;

class PalindromeChecker {
    
    String text;

    
    public boolean checkPalindrome() {
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 
        String reversedText = new StringBuilder(cleanedText).reverse().toString();
        return cleanedText.equals(reversedText);
    }

    
    public void displayResult() {
        System.out.println("Original Text: " + text);
        if (checkPalindrome()) {
            System.out.println("Result: It's a palindrome.");
        } else {
            System.out.println("Result: It's not a palindrome.");
        }
    }


    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker();
        checker.text = "Madam";  
        checker.displayResult();
    }
}
