package Lab_7;

public class Activity_2_BasePlusCommEmployee extends Activity_2_commissionEmployee {
    private double salary;

    Activity_2_BasePlusCommEmployee() {
        salary = 48000;
    }

    Activity_2_BasePlusCommEmployee(String A, String E, String B, double C, double D, double S) {
        super(A, E, B, C, D);
        salary = S;
    }

    //overridden method
    public double earnings() {
        return super.earnings() + salary;
    }

    public void display() {
        super.display();
        System.out.println("Salary : " + salary);
    }
}
