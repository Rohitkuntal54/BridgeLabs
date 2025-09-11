package com.bridgelabz.oops.levelone;

class BankAccount {
    
    String accountHolder;
    String accountNumber;
    double balance;

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        }
    }

    
    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }

    
    public static void main(String[] args) {
        
        BankAccount account = new BankAccount();
        account.accountHolder = "Rahul Verma";
        account.accountNumber = "ACC123456";
        account.balance = 10000.00;

        
        System.out.println("Initial Account Details:");
        account.displayBalance();

        System.out.println("\nDepositing ₹2500...");
        account.deposit(2500);

        System.out.println("\nWithdrawing ₹4000...");
        account.withdraw(4000);

        System.out.println("\nWithdrawing ₹10000 (should fail)...");
        account.withdraw(10000);

        System.out.println("\nFinal Account Details:");
        account.displayBalance();
    }
}

