package Lab_3;

public class Task_2 {
    public static void main(String[] args) {
        // Create first account with initial balance
        Task_2_Account Ali = new Task_2_Account(1000.0);
        System.out.println("Account 1 balance(Ali): " + Ali.getBalance());

        // Create second account with same balance as first account
        Task_2_Account Ahmad = new Task_2_Account(Ali.getBalance());
        System.out.println("Account 2 balance(Ahmad): " + Ahmad.getBalance());

        Ali.deposit(500.0);
        Ahmad.withdraw(200.0);

        System.out.println("Account 1(Ali) balance after deposit: " + Ali.getBalance());
        System.out.println("Account 2(Ahmad) balance after withdrawal: " + Ahmad.getBalance());


    }
}
