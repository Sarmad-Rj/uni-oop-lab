package Lab_6;

public class Activity_1_Student extends Activity_1_Person {
    private String rollNo;
    private int marks;

    public Activity_1_Student() {
        super();
        rollNo = "sp14bcs039";
        marks = 345;
    }

    public Activity_1_Student(String a, String b, String c, String d, int e) {
        super(a, b, c);
        rollNo = d;
        marks = e;
    }

    public void setRollNo(String a) {
        rollNo = a;
    }

    public void setMarks(int a) {
        marks = a;
    }

    public String getRollNo() {
        return rollNo;
    }

    public int getMarks() {
        return marks;
    }

    public void display() {
        super.display();
        System.out.println("Roll # : " + rollNo + "\nMarks : " + marks);
    }
}

