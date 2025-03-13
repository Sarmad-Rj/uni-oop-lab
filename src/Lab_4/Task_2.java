package Lab_4;

public class Task_2 {
    public static void main(String[] args) {
        // Create first Book object using no-argument constructor
        Task_2_Book book1 = new Task_2_Book();
        book1.setAuthor("Author A");
        book1.setChapterNames(new String[] { "Chapter 1", "Chapter 2", "Chapter 3" });

        // Create second Book object using argument constructor
        Task_2_Book book2 = new Task_2_Book("Author B", new String[] { "Chapter 1", "Chapter 2", "Chapter 3", "Chapter 4" });

        // Compare authors
        boolean sameAuthor = Task_2_Book.compareBooks(book1, book2);
        System.out.println("Do both books have the same author? " + sameAuthor);

        // Compare chapter names and display the author of the book with more chapters
        Task_2_Book largerBook = Task_2_Book.compareChapterNames(book1, book2);
        System.out.println("The author of the book with more chapters is: " + largerBook.getAuthor());
    }
}
