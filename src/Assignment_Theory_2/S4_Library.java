package Assignment_Theory_2;
import java.util.ArrayList;
import java.util.List;
public class S4_Library {
    private List<S4_Book> books;

    // Constructor
    public S4_Library() {
        this.books = new ArrayList<>();
    }

    // Add Book to Library
    public void addBook(S4_Book book) {
        books.add(book);
    }

    // Borrow Book from Library
    public S4_Book borrowBook(int bookId) {
        for (S4_Book book : books) {
            if (book.getBookId() == bookId) {
                books.remove(book);
                return book;
            }
        }
        System.out.println("Book with ID " + bookId + " is not available!");
        return null;
    }

    // Return Book to Library
    public void returnBook(S4_Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " has been returned to the library.");
    }

    // Display All Available Books
    public void displayAvailableBooks() {
        System.out.println("Available Books in the Library:");
        for (S4_Book book : books) {
            System.out.println("  - " + book.getTitle() + " by " + book.getAuthor());
        }
    }
}
