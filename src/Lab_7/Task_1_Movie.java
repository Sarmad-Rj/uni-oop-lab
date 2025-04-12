package Lab_7;

public class Task_1_Movie {
    private String title;
    private int idNumber;
    private String mpaaRating;

    // Constructor
    public Task_1_Movie() {
        this.title = "title";
        this.idNumber = 0;
        this.mpaaRating = "mpaaRating";
    }
    public Task_1_Movie(String title, int idNumber, String mpaaRating) {
        this.title = title;
        this.idNumber = idNumber;
        this.mpaaRating = mpaaRating;
    }

    // Accessor and mutator methods
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getIdNumber() {
        return idNumber;
    }
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
    public String getMpaaRating() {
        return mpaaRating;
    }
    public void setMpaaRating(String mpaaRating) {
        this.mpaaRating = mpaaRating;
    }



    // equals method
//    @Override
//    public boolean equals(Object obj) { //In Java, instanceof is a keyword used to check whether an object is an instance (or belongs to) a specific class or a subclass of that class.
//        if (obj instanceof Task_1_Movie) {
//            Task_1_Movie other = (Task_1_Movie) obj;
//            return this.idNumber == other.idNumber;
//        }
//        return false;
//    }
    // Overriding equals() method
    @Override
    public boolean equals(Object obj) { // predefined method -  By default, the equals() method in the Object class compares two objects for reference equality
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false; // getClass() - predefined method  - return the runtime class of an object.

        Task_1_Movie movie = (Task_1_Movie) obj;
        return idNumber == movie.idNumber;
    }
    // Default calcLateFees method
    public double calcLateFees(int daysLate) {
        return daysLate * 2.0; // $2/dayx
    }
}
