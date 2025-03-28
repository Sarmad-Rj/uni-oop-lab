package Lab_6;

public class Activity_2_Regular extends Activity_2_Employee {
    private int basicPay;

    public Activity_2_Regular(String name, String phone, String address, int allowance, int basicPay) {
        super(name, phone, address, allowance);
        this.basicPay = basicPay;
    }

    public void Display(){
        System.out.println("Name: " + name + "Phone Number: " + phone + "Address: " + address + "Allowance: " + allowance + "Basic Pay: " + basicPay);
    }

}
