package Lab_7;

public class Task_2_VerifiedSimple extends Task_2_Simple{

    // Constructor for the child class
    public Task_2_VerifiedSimple(int num1, int num2) {
        super(num1, num2);
    }

    @Override
    public void add() {
        if (num1 > 0 && num2 > 0) {
            super.add();
        } else {
            System.out.println("Error: Numbers must be greater than 0 for addition.");
        }
    }

    @Override
    public void sub() {
        if (num1 > 0 && num2 > 0) {
            super.sub();
        } else {
            System.out.println("Error: Numbers must be greater than 0 for subtraction.");
        }
    }

    @Override
    public void mul() {
        if (num1 > 0 && num2 > 0) {
            super.mul();
        } else {
            System.out.println("Error: Numbers must be greater than 0 for multiplication.");
        }
    }

    @Override
    public void div() {
        if (num1 > 0 && num2 > 0) {
            super.div();
        } else {
            System.out.println("Error: Numbers must be greater than 0 for division.");
        }
    }
}