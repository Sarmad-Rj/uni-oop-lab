package Lab_7;

public class Task_2 {
    public static void main(String[] args) {
        // Example with valid positive numbers
        Task_2_VerifiedSimple obj1 = new Task_2_VerifiedSimple(10, 5);
        obj1.add();
        obj1.sub();
        obj1.mul();
        obj1.div();

        // Example with numbers not greater than 0
        Task_2_VerifiedSimple obj2 = new Task_2_VerifiedSimple(-2, 3);
        obj2.add();
        obj2.sub();
        obj2.mul();
        obj2.div();
    }
}