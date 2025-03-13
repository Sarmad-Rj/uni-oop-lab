package Lab_4;

public class Task_3_Fraction {
    private int numerator;
    private int denominator;

    // No-argument constructor
    public Task_3_Fraction() {
        this.numerator = 0;
        this.denominator = 1; // Default value to avoid division by zero
    }

    // Parameterized constructor
    public Task_3_Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        this.denominator = denominator;
    }

    // Setter methods
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        this.denominator = denominator;
    }

    // Getter methods
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    // Method to display the fraction
    public void display() {
        System.out.println(numerator + "/" + denominator);
    }

    // Equals method to compare two fractions
    public boolean equals(Task_3_Fraction otherFraction) {
        // Two fractions are identical if their reduced forms are the same
        return this.numerator * otherFraction.denominator == this.denominator * otherFraction.numerator;
    }
}