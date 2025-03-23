//Scenario 2: Book Comparison System
//A book management system requires an Encapsulated Book class to compare books based on their authors and chapter count.
//Problem Statement:
//         Define an encapsulated Book class with attributes:
//                o author (String)
//                o chapterNames[100] (String array for storing chapter names)
//         Implement two overloaded constructors:
//                o A no-argument constructor.
//                o A parameterized constructor with author and chapterNames.
//         Create a method compareBooks(Book b) that compares the authors of two books and returns true if both books have the same author, otherwise false.
//         Create a method compareChapterNames(Book b) that compares the number of chapters between two books and returns the book with more chapters.
//         Implement a Runner class that:
//                o Creates two Book objects (one using the no-argument constructor and another with the parameterized constructor).
//                o Uses setter methods to assign values to the first book.
//                o Calls compareBooks() and compareChapterNames() and displays the results.
package Assignment_2;

public class P2 {
    public static void main(String[] args) {

        P2_Book book1 = new P2_Book();
        book1.setAuthor("Author A");
        String[] chapters1 = {"Chapter 1", "Chapter 2", "Chapter 3"};
        book1.setChapterNames(chapters1);


        String[] chapters2 = {"Chapter 1", "Chapter 2", "Chapter 3", "Chapter 4", "Chapter 5"};
        P2_Book book2 = new P2_Book("Author B", chapters2);


        boolean sameAuthor = book1.compareBooks(book2);
        System.out.println("Are both books by the same author? " + sameAuthor);
        P2_Book moreChaptersBook = book1.compareChapterNames(book2);
        System.out.println("The book with more chapters is by author: " + moreChaptersBook.getAuthor());
    }
}