package Lab_6;

public class Activity_2_Adhoc extends Activity_2_Employee {
    private int numberOfWorkingDays;
    private int wage;

    public Activity_2_Adhoc(String name, String phone, String address, int allowance, int numberOfWorkingDays, int wage) {
        super(name, phone, address, allowance);
        this.numberOfWorkingDays = numberOfWorkingDays;
        this.wage = wage;
    }

    public void Display() {
        System.out.println("Name: " + name + "Phone Number: " + phone + "Address: " + address + "Allowance: " + allowance + "Number Of Working Days: " + numberOfWorkingDays + "Wage: " + wage);
    }

}
