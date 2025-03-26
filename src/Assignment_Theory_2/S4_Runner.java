//Scenario 4: Library Management System
//A library wants to develop a Library Management System that allows users to borrow and return books
//while ensuring proper access control.
//            A LibraryUser class with attributes userId, userName, and a list of borrowed books.
//            A Book class with attributes bookId, title, and author.
//            A Library class that maintains a collection of books and manages borrowing and returning (use Composition).
//Problem Statement:
//            Implement the LibraryUser, Book, and Library classes using OOP principles.
//            Ensure proper encapsulation to prevent unauthorized modification of book data.
//            Demonstrate object creation, book borrowing, and returning operations.
package Assignment_Theory_2;

public class S4_Runner { //LibraryManagementSystem
    public static void main(String[] args) {
        // Create Library and Add Books
        S4_Library library = new S4_Library();
        S4_Book book1 = new S4_Book(101, "1984", "George Orwell");
        S4_Book book2 = new S4_Book(102, "To Kill a Mockingbird", "Harper Lee");
        library.addBook(book1);
        library.addBook(book2);

        // Display Available Books
        library.displayAvailableBooks();

        // Create Library User
        S4_LibraryUser user = new S4_LibraryUser(1, "Alice");

        // Borrow a Book
        S4_Book borrowedBook = library.borrowBook(101);
        if (borrowedBook != null) {
            user.borrowBook(borrowedBook);
        }

        // Display User's Borrowed Books
        user.displayBorrowedBooks();

        // Return a Book
        user.returnBook(borrowedBook);
        library.returnBook(borrowedBook);

        // Display Available Books Again
        library.displayAvailableBooks();
    }
}

