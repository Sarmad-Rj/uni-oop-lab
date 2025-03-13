package Lab_4;


public class Task_2_Book {
    private String author;
    private String[] chapterNames = new String[100];

    // No-argument constructor
    public Task_2_Book() {
        this.author = "";
    }

    // Constructor with arguments
    public Task_2_Book(String author, String[] chapterNames) {
        this.author = author;
        this.chapterNames = chapterNames;
    }

    // Setters
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setChapterNames(String[] chapterNames) {
        this.chapterNames = chapterNames;
    }

    // Getters
    public String getAuthor() {
        return author;
    }

    public String[] getChapterNames() {
        return chapterNames;
    }

    // Method to compare authors
    public static boolean compareBooks(Task_2_Book book1, Task_2_Book book2) {
        return book1.author.equals(book2.author);
    }

    // Method to compare chapter names
    public static Task_2_Book compareChapterNames(Task_2_Book book1, Task_2_Book book2) {
        int chapters1 = 0, chapters2 = 0;

        // Count non-null chapters
        for (String chapter : book1.chapterNames) {
            if (chapter != null) chapters1++;
        }
        for (String chapter : book2.chapterNames) {
            if (chapter != null) chapters2++;
        }

        // Return the book with more chapters
        return (chapters1 > chapters2) ? book1 : book2;
    }
}

