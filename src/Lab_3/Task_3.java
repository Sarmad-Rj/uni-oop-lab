package Lab_3;

public class Task_3 {
    public static void main(String[] args) {

        Task_3_Student student1 = new Task_3_Student("John", new int[] {90, 85, 95, 88, 92});
        Task_3_Student student2 = new Task_3_Student("Alice", new int[] {95, 90, 92, 89, 96});

        double average1 = student1.average();
        double average2 = student2.average();

        System.out.println("Average of " + student1.getName() + ": " + average1);
        System.out.println("Average of " + student2.getName() + ": " + average2);

        if (average1 > average2) {
            System.out.println(student1.getName() + " has higher average.");
        } else if (average2 > average1) {
            System.out.println(student2.getName() + " has higher average.");
        } else {
            System.out.println("Both students have the same average.");
        }

        Task_3_Student student3 = new Task_3_Student(student1.getName(), student2.getResultArray());

        System.out.println("Name of student3: " + student3.getName());
        System.out.println("Result array of student3: ");
        for (int i = 0; i < student3.getResultArray().length; i++) {
            System.out.print(student3.getResultArray()[i] + " ");
        }
    }
}
