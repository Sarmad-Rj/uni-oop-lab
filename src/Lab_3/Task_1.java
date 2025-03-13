package Lab_3;

public class Task_1 {
    public static void main(String[] args) {

        //Default Marks
        Task_1_Marks m0 = new Task_1_Marks();
        System.out.println("Default marks!");
        m0.Display();

        // using setter and getter
        Task_1_Marks m1 =new Task_1_Marks();
        m1.setMark_1(40);
        m1.setMark_2(45);
        m1.setMark_3(50);
        System.out.println("Marks set by setters!");
        System.out.println("Marks_1: " + m1.getMark_1());
        System.out.println("Marks_2: " + m1.getMark_2());
        System.out.println("Marks_3: " + m1.getMark_3());

//        m1.Display();


    }
}
