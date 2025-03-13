package Lab_3;

public class Task_2_Account {
    private double balance;

    public Task_2_Account() {
        balance = 0;
    }
    public Task_2_Account(double balance) {
        balance = balance;
    }
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
