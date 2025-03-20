package Lab_6;

public class Activity_1_Person {
    protected String name;
    protected String id;
    protected String phone;

    public Activity_1_Person() {
        name = "NA";
        id = "NA";
        phone = "12345";
    }

    public Activity_1_Person(String a, String b, String c) {
        name = a;
        id = b;
        phone = c;
    }

    public void setName(String a) {
        name = a;
    }

    public void setId(String j) {
        id = j;
    }

    public void setPhone(String a) {
        phone = a;
    }

    public String getName() {
        return name;
    }

    public String getid() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public void display() {
        System.out.println("Name : " + name + "\nID : " + id + "\nPhone : " + phone);
    }

}
