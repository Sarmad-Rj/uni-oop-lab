package Lab_4;

public class Task_1 {
    public static void main(String[] args) {
        // Create two Distance objects
        Task_1_Distance d1 = new Task_1_Distance(5, 8);
        Task_1_Distance d2 = new Task_1_Distance(15, 10);

        // Add them together
        Task_1_Distance result = d1.add(d2);

        // Display the result
        result.display();
    }
}
