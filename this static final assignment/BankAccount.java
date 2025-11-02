public class BankAccount {
    
    private static String bankName = "State Bank of India";
    private static int totalAccounts = 0;

   
    private String accountHolderName;
    private final String accountNumber;  
    private double balance;

   
    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName; 
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++; 
    }

    
    public static void getTotalAccounts() {
        System.out.println("Total Accounts in " + bankName + ": " + totalAccounts);
    }

    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: ₹" + balance);
            System.out.println("----------------------------------");
        } else {
            System.out.println("Invalid account object.");
        }
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount + ". New Balance: ₹" + balance);
        }
    }

 
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + ". New Balance: ₹" + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", "SBI001", 5000);
        BankAccount acc2 = new BankAccount("Bob", "SBI002", 10000);

        acc1.displayAccountDetails();
        acc2.displayAccountDetails();

        acc1.deposit(2000);
        acc2.withdraw(1500);

        BankAccount.getTotalAccounts(); 
    }
}
