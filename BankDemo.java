// File: BankDemo.java
import java.util.ArrayList;

class Account {
    private int accountNumber;
    private String customerName;
    private double balance;

    // Constructor
    public Account(int accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    // Getters
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited - BankDemo.java:33" + amount + " to account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount! - BankDemo.java:35");
        }
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew - BankDemo.java:43" + amount + " from account " + accountNumber);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount! - BankDemo.java:45");
        }
    }

    // Display account info
    public void displayAccount() {
        System.out.println("Account No: - BankDemo.java:51" + accountNumber + 
                           ", Customer: " + customerName + 
                           ", Balance: " + balance);
    }
}

class Bank {
    private ArrayList<Account> accounts;

    // Constructor
    public Bank() {
        accounts = new ArrayList<>();
    }

    // Add account
    public void addAccount(Account acc) {
        accounts.add(acc);
        System.out.println("Account - BankDemo.java:68" + acc.getAccountNumber() + " added successfully.");
    }

    // Remove account
    public void removeAccount(int accountNumber) {
        Account toRemove = null;
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accountNumber) {
                toRemove = acc;
                break;
            }
        }
        if (toRemove != null) {
            accounts.remove(toRemove);
            System.out.println("Account - BankDemo.java:82" + accountNumber + " removed successfully.");
        } else {
            System.out.println("Account not found! - BankDemo.java:84");
        }
    }

    // Deposit money
    public void depositToAccount(int accountNumber, double amount) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accountNumber) {
                acc.deposit(amount);
                return;
            }
        }
        System.out.println("Account not found! - BankDemo.java:96");
    }

    // Withdraw money
    public void withdrawFromAccount(int accountNumber, double amount) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accountNumber) {
                acc.withdraw(amount);
                return;
            }
        }
        System.out.println("Account not found! - BankDemo.java:107");
    }

    // Display all accounts
    public void displayAllAccounts() {
        System.out.println("\n=== Bank Accounts === - BankDemo.java:112");
        for (Account acc : accounts) {
            acc.displayAccount();
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Create accounts
        Account a1 = new Account(101, "Alice", 1000);
        Account a2 = new Account(102, "Bob", 2000);

        // Add accounts
        bank.addAccount(a1);
        bank.addAccount(a2);

        // Display accounts
        bank.displayAllAccounts();

        // Deposit money
        bank.depositToAccount(101, 500);

        // Withdraw money
        bank.withdrawFromAccount(102, 700);

        // Display accounts again
        bank.displayAllAccounts();

        // Remove account
        bank.removeAccount(101);

        // Display after removal
        bank.displayAllAccounts();
    }
}
