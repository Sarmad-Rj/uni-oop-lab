package Assignment_Theory_2;

public class S2_BankAccount {
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    public S2_BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Public Method to Deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Public Method to Withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance!");
        }
    }

    // Public Method to Get Balance
    public double getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
}
