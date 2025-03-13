package Lab_2;
import java.util.*;

public class Account {
    int balance;

    public Account(){
        balance = 0;
    }

    public Account(int setbalance){
        balance = setbalance;
    }

    public void displayBalance(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount: ");
        int amount = sc.nextInt();
        balance = amount;

        System.out.println("Amount Diposited Successfully");
    }




}
