package Assignment_Theory_2;

// SavingsAccount Class (Extends BankAccount)
class S2_SavingsAccount extends S2_BankAccount {
    private double withdrawalLimit;

    public S2_SavingsAccount(String accountNumber, String accountHolderName, double initialBalance, double withdrawalLimit) {
        super(accountNumber, accountHolderName, initialBalance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > withdrawalLimit) {
            System.out.println("Withdrawal failed! Amount exceeds the withdrawal limit of: " + withdrawalLimit);
        } else {
            super.withdraw(amount); // Call the base class method for withdrawal logic
        }
    }
}
