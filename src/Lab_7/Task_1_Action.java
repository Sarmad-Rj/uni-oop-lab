package Lab_7;

public class Task_1_Action extends Task_1_Movie{
    public Task_1_Action(String title, int idNumber, String mpaaRating) {
        super(title, idNumber, mpaaRating);
    }
    public Task_1_Action() {
        super("title", 0, "mpaaRating");
    }

    @Override
    public double calcLateFees(int daysLate) {
        return daysLate * 3.0; // $3/day
    }
}
