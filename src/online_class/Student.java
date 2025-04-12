package online_class;

public class Student {
    private String name;
    private int rollNo;
    private float cgpa;
    public Student() {
        name = "Not Available";
        rollNo = 0;
        cgpa = 0;
    }

    public Student(String n, int r, float c) {
        this.name = n;
        rollNo = r;
        cgpa = c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }


    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public void displayDetail() {
        System.out.println("Name: " + name + " | Roll no: " + rollNo + " | CGPA: " + cgpa);
    }
}
