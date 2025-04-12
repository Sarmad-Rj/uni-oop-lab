package online_class;

public class Student_Runner {
    public static void main(String[] args) {

        Student Mazhar = new Student();
//        Mazhar.name = "Mazhar";
//        Mazhar.cgpa = 2.6f;
//        Mazhar.rollNo = 130;
        Mazhar.setName("Mazhar");


        Mazhar.displayDetail();

        Student Sarmad =  new Student("Sarmad", 69, 2.9f);
        Sarmad.displayDetail();


    }
}
