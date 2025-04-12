package Lab_7;

public class Task_1 {
    public static void main(String[] args) {
        Task_1_Movie actionMovie = new Task_1_Action("Fast & Furious", 101, "PG-13");
        Task_1_Movie comedyMovie = new Task_1_Comedy("The Mask", 102, "PG");
        Task_1_Movie dramaMovie = new Task_1_Drama("The Godfather", 103, "R");

        System.out.println(actionMovie.getTitle() + " late fees for 5 days: $" + actionMovie.calcLateFees(5));
        System.out.println(comedyMovie.getTitle() + " late fees for 3 days: $" + comedyMovie.calcLateFees(3));
        System.out.println(dramaMovie.getTitle() + " late fees for 7 days: $" + dramaMovie.calcLateFees(7));

        // Testing equals() method
        Task_1_Movie anotherActionMovie = new Task_1_Action("Fast & Furious", 101, "PG-13");
        Task_1_Movie actionMovie1 = new Task_1_Action("The Mask", 102, "PG");

        System.out.println("Are the two movies equal? " + actionMovie.equals(anotherActionMovie));
        System.out.println("Are the two movies equal? " + actionMovie.equals(actionMovie1));

    }
}
