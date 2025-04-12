package Lab_7;

public class Activity_2 {
    public static void main(String args[])
    {
        Activity_2_BasePlusCommEmployee b = new Activity_2_BasePlusCommEmployee("ali", "ahmed", "25-kkn", 100, 5.2, 25000);
        double earn = b.earnings();
        System.out.println("Earning of employee is " + earn);
    }

}
