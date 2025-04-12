package Lab_7;

public class Task_2_Simple {
    int num1;
    int num2;

    // Constructor to initialize the numbers
    public Task_2_Simple(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Add function
    public void add() {
        System.out.println("Sum: " + (num1 + num2));
    }

    // Subtract function
    public void sub() {
        System.out.println("Difference: " + (num1 - num2));
    }

    // Multiply function
    public void mul() {
        System.out.println("Product: " + (num1 * num2));
    }

    // Divide function
    public void div() {
        if (num2 != 0) {
            System.out.println("Quotient: " + (num1 / num2));
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
