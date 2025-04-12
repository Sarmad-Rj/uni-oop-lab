package Lab_7;

public class Task_1_Comedy extends Task_1_Movie{
    public Task_1_Comedy(String title, int idNumber, String mpaaRating) {
        super(title, idNumber, mpaaRating);
    }

    @Override
    public double calcLateFees(int daysLate) {
        return daysLate * 2.5; // $2.50/day
    }
}

