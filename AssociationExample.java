package AssistedProblems;

import java.util.*;

class Customer {
    private String name;
    private double balance;

    public Customer(String name) {
        this.name = name;
        this.balance = 0.0;
    }

    public void viewBalance() {
        System.out.println(name + "'s Balance: " + balance);
    }

    public void deposit(double amount) {
        balance += amount;
    }
}

class Bank {
    private String bankName;
    private List<Customer> customers;

    public Bank(String bankName) {
        this.bankName = bankName;
        customers = new ArrayList<>();
    }

    public void openAccount(Customer c, double initialDeposit) {
        customers.add(c);
        c.deposit(initialDeposit);
        System.out.println("Account opened for " + c + " in " + bankName);
    }

    public void showCustomers() {
        System.out.println("Bank: " + bankName);
        for (Customer c : customers) {
            c.viewBalance();
        }
    }
}

public class AssociationExample {
    public static void main(String[] args) {
        Bank bank = new Bank("SBI Bank");

        Customer c1 = new Customer("Ayush");
        Customer c2 = new Customer("Mohan");

        bank.openAccount(c1, 1000);
        bank.openAccount(c2, 2000);

        bank.showCustomers();
    }
}
