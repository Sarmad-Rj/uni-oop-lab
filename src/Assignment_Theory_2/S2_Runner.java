//Scenario 2: Bank Account Management System
//A bank needs a Bank Account Management System where customers can open and manage their accounts securely.
//The system should include:
//            A BankAccount class with private attributes accountNumber, balance, and accountHolderName.
//            Public methods deposit(double amount), withdraw(double amount), and getBalance().
//            A SavingsAccount class that extends BankAccount and applies a withdrawal limit.
//Problem Statement:
//            Implement the BankAccount and SavingsAccount classes using Encapsulation and Abstraction.
//            Ensure that balance updates follow data hiding principles.
//            Provide Java code demonstrating account transactions.

package Assignment_Theory_2;

public class S2_Runner { // BankAccountManagementSystem
    public static void main(String[] args) {
        // Create a Regular Bank Account
        S2_BankAccount account1 = new S2_BankAccount("001", "Alice", 5000);
        System.out.println("Account Holder: " + account1.getAccountHolderName());

        // Deposit and Withdraw from Regular Account
        account1.deposit(1500);
        account1.withdraw(2000);

        // Create a Savings Account with a Withdrawal Limit
        S2_SavingsAccount savingsAccount = new S2_SavingsAccount("002", "Bob", 8000, 3000);
        System.out.println("\nAccount Holder: " + savingsAccount.getAccountHolderName());

        // Deposit and Withdraw from Savings Account
        savingsAccount.deposit(2000);
        savingsAccount.withdraw(3500); // Exceeds limit
        savingsAccount.withdraw(2500); // Within limit
    }
}

