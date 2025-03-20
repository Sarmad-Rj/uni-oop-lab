package Lab_5;

public class Activity_2_employee {
    private String name;
    private String fname;
    private Activity_2_Date birthdate;
    private Activity_2_Date hiredate;
    Activity_2_employee() {
    }
    Activity_2_employee(String x, String y, Activity_2_Date birthofDate, Activity_2_Date dateofHire) {
        name = x;
        fname = y;
        birthdate = birthofDate;
        hiredate = dateofHire;
    }

    // Setter Getters
    public void setname(String x) {
        name = x;
    }
    public String getname() {
        return name;
    }
    public void setfname(String x) {
        fname = x;
    }
    public String getfname() {
        return fname;
    }
    public void setbirthdate(Activity_2_Date b) {
        birthdate = b;
    }
    public Activity_2_Date getbirthdate() {
        return birthdate;
    }
    public void sethiredate(Activity_2_Date h) {
        hiredate = h;
    }

    public Activity_2_Date gethiredate() {
        return hiredate;
    }
    public void display() {
        System.out.println("Name: " + name + " Father Name: " + fname);
        birthdate.display();
        hiredate.display();
    }
}
