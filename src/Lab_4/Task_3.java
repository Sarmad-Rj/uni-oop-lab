package Lab_4;

public class Task_3 {
    public static void main(String[] args) {
        // Create the first fraction using the no-argument constructor
        Task_3_Fraction fraction1 = new Task_3_Fraction();
        fraction1.setNumerator(1);
        fraction1.setDenominator(2);

        // Create the second fraction using the parameterized constructor
        Task_3_Fraction fraction2 = new Task_3_Fraction(2, 4);

        // Display both fractions
        System.out.print("Fraction 1: ");
        fraction1.display();
        System.out.print("Fraction 2: ");
        fraction2.display();

        // Compare the fractions
        boolean areEqual = fraction1.equals(fraction2);
        System.out.println("Are the two fractions identical? " + areEqual);
    }
}
