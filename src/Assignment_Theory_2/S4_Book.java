package Assignment_Theory_2;

public class S4_Book {
    private int bookId;
    private String title;
    private String author;

    // Constructor
    public S4_Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    // Getter Methods
    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
